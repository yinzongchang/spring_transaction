package com.yinzo.demo4;


import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title: AccountServiceImpl<br>
 * Description: <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2016/12/25
 */

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * @param out
     * @param in
     * @param money
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    /**
     * propagation : 事务的传播行为
     * isolation : 事务的隔离级别
     * readOnly : 只读属性
     * rollbackFor : 发生哪些异常回滚
     * noRollbackFor : 发生哪些异常不回滚
     */
    public void transfer(String out, String in, Double money) {

        System.out.println("调用方法");
        accountDao.outMoney(out, money);
        int i = 1 / 0;
        accountDao.inMoney(in, money);
        System.out.println("转账成功");

    }

}
