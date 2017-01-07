package com.yinzo.demo3;

/**
 * Title: AccountDao<br>
 * Description: <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2016/12/25
 */
public interface AccountDao {

    /**
     * 转出钱粮
     *
     * @param out
     * @param money
     */
    public void outMoney(String out, Double money);

    /**
     * 转入钱粮
     *
     * @param in
     * @param money
     */
    public void inMoney(String in, Double money);

}
