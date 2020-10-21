package com.study.java.lang.format;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

/**
 * @author liu.ming320<br>
 * @CreatedDate 2020/10/21 16:20 <br>
 * @package com.study.java.lang.format <br>
 */
public class DateFormatTest {
    @Test
    public void formatDate() {
        String dataStr = "29-9-2020 10:38:12 AM";

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy K:m:s a", Locale.ENGLISH); //会将你的本地的时间格式转化掉
        Date d2 = null;
        try {
            d2 = sdf.parse(dataStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Date d3 = new Date();
        System.out.println("d2 ====== "+ new Date(d2.getTime()));

        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateString=format.format(d2);   //格林时间变成标准时间
        System.out.println("lll: "+dateString);

        System.out.println("d3 ====== "+sdf.format(d3));  //标准时间变成格林时间
    }
}
