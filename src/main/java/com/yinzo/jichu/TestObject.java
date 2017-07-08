package com.yinzo.jichu;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: TestObject.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/3/21
 */
public class TestObject {

    public static void main(String[] args) {
        User user= new User();

        user.setId(1L);
        user.setAddress("bj");
        user.setName("yinzo");
        User user1= user;
        user1.setName("hehe");
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);


/*
        for (User u : userList) {
            u.setAddress("hehe");
        }*/
        System.out.println(JSON.toJSONString(user));
        System.out.println(JSON.toJSONString(user1));



/*        for (Long i = 100L; i < 103; i ++) {
            User s = ReflectUtil.cloneFrom(user, User.class);
//            User s = user;
            s.setId(i);
            userList.add(s);
        }*/
//        System.out.println(JSON.toJSONString(user));

    }


}
