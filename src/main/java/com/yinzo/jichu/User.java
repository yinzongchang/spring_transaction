package com.yinzo.jichu;

/**
 * Title: User.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/3/21
 */
public class User {

    private Long id;

    private String name;

    private String address;

/*    public User() {
        super();
    }

    public User(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
