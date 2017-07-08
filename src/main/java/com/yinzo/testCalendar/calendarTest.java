package com.yinzo.testCalendar;

import java.util.Calendar;

/**
 * Title: calendarTest.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/2/28
 */
public class calendarTest {

    public static void main(String[] args) {
//        final Calendar calendar = Calendar.getInstance();

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1488340800 * 1000L);




        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        Calendar calendarFinal = hour >= 12 ? addDay(calendar, 1) : calendar;

        calendarFinal.set(Calendar.HOUR_OF_DAY, 0);
        calendarFinal.set(Calendar.SECOND, 0);
        calendarFinal.set(Calendar.MINUTE, 0);
        calendarFinal.set(Calendar.MILLISECOND, 0);

        System.out.println((int)(calendarFinal.getTimeInMillis()/1000));

//        return (int)(calendarFinal.getTimeInMillis()/1000);

    }

    public static Calendar addDay(Calendar calendar, int n) {
        Calendar cd = (Calendar) calendar.clone();
        cd.add(Calendar.DATE, n);//增加n天
        return cd;
    }


}
