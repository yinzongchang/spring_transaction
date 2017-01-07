package com.yinzo.demo2;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Title: 声明式事务管理 -- 方式一<br>
 * Description: <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2016/12/25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {

//    @Resource(name = "accountService")
//    AccountService accountService;

    // 注入代理类
    @Resource(name = "accountServiceProxy")
    AccountService accountService;

    @Test
    public void run() {

        accountService.transfer("aaa", "bbb", 200d);

    }
}
