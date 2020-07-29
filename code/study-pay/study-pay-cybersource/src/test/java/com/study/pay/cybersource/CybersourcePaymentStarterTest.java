package com.study.pay.cybersource;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import com.study.pay.cybersource.utils.CyberSourceSignUtils;

//import freemarker.template.Configuration;
//import freemarker.template.Template;
//import freemarker.template.TemplateException;

/**
 * @author liu.ming320<br>
 * @CreatedDate 2020/7/29 19:52 <br>
 * @package com.study.pay.cybersource <br>
 */
public class CybersourcePaymentStarterTest {
//    private static final Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
//
//    static {
//        cfg.setDefaultEncoding("UTF-8");
//        try {
//            cfg.setSetting("number_format", "computer");
//        }
//        catch (TemplateException e) {
//            System.out.println("unsupported setting");
//        }
//    }
//
//    public static void main(String[] args)
//            throws NoSuchAlgorithmException, InvalidKeyException, IOException, TemplateException {
//        Map<String, Object> map = new HashMap<>(16);
//        map.put("access_key", "699a4d1e978e3ec6b9e1e71df50d0afd");
//        map.put("profile_id", "BFF2EF07-E376-4E9F-9A64-3CB9D602090E");
//        map.put("transaction_uuid", "123456789988");
//        map.put("signed_field_names", "access_key,profile_id,transaction_uuid,signed_field_names,unsigned_field_names,signed_date_time,locale,transaction_type,reference_number,amount,currency");
//        map.put("signed_date_time", "2020-07-28T02:56:45Z");
//        map.put("locale", "en");
//        map.put("transaction_type", "sale");
//        map.put("reference_number", "123456789988");
//        map.put("amount", "0.01");
//        map.put("currency", "PHP");
//        map.put("unsigned_field_names", "");
//        String sign = new CyberSourceSignUtils().sign(map, "ca50e601d02049bd8f31937221959a1202579108cb49474f97911cc2250eb5e0590ff485d4b845129249262deb65aeade794bc2f23e744d690f8660920676445d264285125fd4a9e910ced1189c04cb550d60f28ded44f0cb487e46a1b2f1403bc31dbb6d3994c12804f37da16de434a089f7cfa75114a8ab9ab4494c15b2798");
//        map.put("signature", sign);
//
//        String str = "<form id = \"payment_confirmation\" action = \"https://testsecureacceptance.cybersource.com/pay\" method = \"post\" >  " +
//                "<input type = \"hidden\" id = \"unsigned_field_names\" name = \"unsigned_field_names\" value = \"\" >  " +
//                "<input type = \"hidden\" id = \"amount\" name = \"amount\" value = \"${amount}\" >  " +
//                "<input type = \"hidden\" id = \"profile_id\" name = \"profile_id\" value = \"${profile_id}\" >  " +
//                "<input type = \"hidden\" id = \"access_key\" name = \"access_key\" value = \"${access_key}\" >  " +
//                "<input type = \"hidden\" id = \"currency\" name = \"currency\" value = \"${currency}\" >  " +
//                "<input type = \"hidden\" id = \"transaction_uuid\" name = \"transaction_uuid\"  " +
//                "        value = \"${transaction_uuid}\" >  " +
//                "<input type = \"hidden\" id = \"signed_field_names\" name = \"signed_field_names\"  value = \"${signed_field_names}\" >" +
//                "<input type = \"hidden\" id = \"locale\" name = \"locale\" value = \"${locale}\" >  " +
//                "<input type = \"hidden\" id = \"transaction_type\" name = \"transaction_type\" value = \"${transaction_type}\" >  " +
//                "<input type = \"hidden\" id = \"reference_number\" name = \"reference_number\" value = \"${reference_number}\" >  " +
//                "<input type = \"hidden\" id = \"signed_date_time\" name = \"signed_date_time\" value = \"${signed_date_time}\" >  " +
//                "<input type = \"hidden\" id = \"signature\" name = \"signature\" value = \"${signature}\" >  " +
//                "  " +
//                "<input type = \"submit\" value = \"Confirm\" style=\"display:none\" >  " +
//                "</form >" +
//                "  " +
//                "<script language=\"javascript\"> document.forms[0].submit(); </script>";
//
//        StringWriter out = new StringWriter();
//        new Template("template", new StringReader(str), cfg).process(map, out);
//        System.out.println(out.toString());
//    }
//
//    private static String getUTCDateTime() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
//        return sdf.format(new Date());
//    }
}
