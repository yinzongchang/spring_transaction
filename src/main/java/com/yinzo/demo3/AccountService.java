package com.yinzo.demo3;

/**
 * Title: AccountService<br>
 * Description: <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2016/12/25
 */
public interface AccountService {

    /**
     *
     * @param out
     * @param in
     * @param money
     */
    public void transfer(String out, String in, Double money);

}
