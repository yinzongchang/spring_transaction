package com.yinzo.testCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Title: testHour.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/3/13
 */
public class testHour {

    public static void main(String[] args) throws ParseException {
        System.err.println(getDateStringByTimeStamp(1489388122, "HH"));
    }



    public static String getDateStringByTimeStamp(Integer timeStamp, String format) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat(format);
        String d = "";
        if (timeStamp != null) {
            d = f.format(((long) timeStamp) * 1000);
        }
        return d;
    }

}
