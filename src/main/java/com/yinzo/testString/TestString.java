package com.yinzo.testString;

/**
 * Title: TestString.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/3/20
 */
public class TestString {

    public static void main(String[] args) {

        Long ownerId = 456789L;
        String str = ownerId + "0000";
        System.out.println(str);

        String passStr = "000000" + "123456";
        String defaultPass = passStr.substring(passStr.length() - 8);
        System.out.println(defaultPass);

        StringBuilder stringBuilder = new StringBuilder("00000").append("123456");
        String a = stringBuilder.substring(stringBuilder.length() - 8);

        System.out.println(a);

    }

}
