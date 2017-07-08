package com.yinzo.jichu;

import java.math.BigDecimal;

/**
 * Title: TestBigDecimal.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/3/21
 */
public class TestBigDecimal {

    static BigDecimal a1 = new BigDecimal(2L);
    static BigDecimal b2 = new BigDecimal(4L);
    static BigDecimal c3 = new BigDecimal(6L);

    public static void main(String[] args) {
        boolean flag = a1.add(b2).compareTo(c3) == 0;
        System.out.println(flag);
    }


}
