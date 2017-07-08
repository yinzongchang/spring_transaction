package com.yinzo.testCalendar;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * Title: testTimestamp.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/3/6
 */
public class testTimestamp {

    public static void main(String[] args) {

        Integer cT = 1488790718;

        Integer day;

        day = (int)((cT >= (getMorningByTimeStamp(cT) + 43200)) ? (getMorningByTimeStamp(cT) + 86400) : getMorningByTimeStamp(cT));

        System.err.println(day);

        System.err.println(getMorningByTimeStamp(1488790718));

        System.err.println(getDayTimeStamp(cT));

    }

    public static long getMorningByTimeStamp(long timeStamp){
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(timeStamp, 0, ZoneOffset.UTC);
        return localDateTime.toLocalDate().atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
    }

    private static int getDayTimeStamp(Integer time) {
        if (time >= (getMorningByTimeStamp(time) + 43200)) {
            return (int)(getMorningByTimeStamp(time) + 86400);
        }
        return (int)getMorningByTimeStamp(time);
    }



}
