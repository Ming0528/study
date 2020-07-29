package com.study.pay.cybersource.utils;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;


public class CyberSourceSignUtils {

    private static final String HMAC_SHA256 = "HmacSHA256";

    public String sign(Map<String, Object> params, String secretKey)
            throws InvalidKeyException, NoSuchAlgorithmException {
        String data = buildDataToSign(params);
        System.out.println(data);
        return sign(data, secretKey);
    }

    private String sign(String data, String secretKey)
            throws InvalidKeyException, NoSuchAlgorithmException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), HMAC_SHA256);
        Mac mac = Mac.getInstance(HMAC_SHA256);
        mac.init(secretKeySpec);
        byte[] rawHmac = mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return DatatypeConverter.printBase64Binary(rawHmac).replace("\n", "");
    }

    private String buildDataToSign(Map<String, Object> params) {
        String[] signedFieldNames = String.valueOf(params.get("signed_field_names")).split(",");
        List<String> dataToSign = new ArrayList<>();
        for (String signedFieldName : signedFieldNames) {
            dataToSign.add(signedFieldName + "=" + params.get(signedFieldName));
        }
        return commaSeparate(dataToSign);
    }

    private String commaSeparate(List<String> dataToSign) {
        StringBuilder csv = new StringBuilder();
        for (Iterator<String> it = dataToSign.iterator(); it.hasNext(); ) {
            csv.append(it.next());
            if (it.hasNext()) {
                csv.append(",");
            }
        }
        return csv.toString();
    }
}
