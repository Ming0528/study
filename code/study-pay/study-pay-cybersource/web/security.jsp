<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.xml.bind.DatatypeConverter" %>
<%@ page import="javax.crypto.Mac" %>
<%@ page import="javax.crypto.spec.SecretKeySpec" %>
<%@ page import="java.security.InvalidKeyException" %>
<%@ page import="java.security.NoSuchAlgorithmException" %>
<%@ page import="java.io.UnsupportedEncodingException" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>

<%! private static final String HMAC_SHA256 = "HmacSHA256";
    private static final String SECRET_KEY = "ca50e601d02049bd8f31937221959a1202579108cb49474f97911cc2250eb5e0590ff485d4b845129249262deb65aeade794bc2f23e744d690f8660920676445d264285125fd4a9e910ced1189c04cb550d60f28ded44f0cb487e46a1b2f1403bc31dbb6d3994c12804f37da16de434a089f7cfa75114a8ab9ab4494c15b2798";

    private String sign(HashMap params) throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
        String str = buildDataToSign(params);
//        System.out.println("singDate is:" + str);
        return sign(str, SECRET_KEY);
    }

    private String sign(String data, String secretKey) throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), HMAC_SHA256);
        Mac mac = Mac.getInstance(HMAC_SHA256);
        mac.init(secretKeySpec);
        byte[] rawHmac = mac.doFinal(data.getBytes("UTF-8"));
        return DatatypeConverter.printBase64Binary(rawHmac).replace("\n", "");
    }

    private String buildDataToSign(HashMap params) {
        String[] signedFieldNames = String.valueOf(params.get("signed_field_names")).split(",");
        ArrayList<String> dataToSign = new ArrayList<String>();
        for (String signedFieldName : signedFieldNames) {
            dataToSign.add(signedFieldName + "=" + String.valueOf(params.get(signedFieldName)));
        }
        return commaSeparate(dataToSign);
    }

    private String commaSeparate(ArrayList<String> dataToSign) {
        StringBuilder csv = new StringBuilder();
        for (Iterator<String> it = dataToSign.iterator(); it.hasNext(); ) {
            csv.append(it.next());
            if (it.hasNext()) {
                csv.append(",");
            }
        }
        return csv.toString();
    }
%>
