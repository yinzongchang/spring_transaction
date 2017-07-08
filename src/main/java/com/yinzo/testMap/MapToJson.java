package com.yinzo.testMap;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: MapToJson.java <br>
 * Description:货位批次库存流水<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 *
 * @author yinzo 2017/4/17
 */
public class MapToJson {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("huanghong", 123L);
        map.put("yinzo", "123");
        map.put("hehe", 123);
        System.err.println(JSON.toJSONString(map));

    }

}
