package com.yinzo.jichu;

import java.lang.reflect.Method;

/**
 * 通用的反射工具类
 * 
 * Title: ReflectUtil.java<br>
 * Description: <br>
 * Copyright: Copyright (c) 2015<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 * 
 * @author undyliu 2015年11月13日
 */
public class ReflectUtil {

    public static <T> T cloneFrom(Object obj, Class<T> clazz) {
        try {
            T result = clazz.newInstance();
            Class objClass = obj.getClass();
            Method[] methods = objClass.getDeclaredMethods();
            for (Method method : methods) {
                String name = method.getName();
                if (name.startsWith("get")) {
                    String subName = name.substring(3);
                    try {
                        Method m = clazz.getMethod("set" + subName, method.getReturnType());
                        m.invoke(result, method.invoke(obj, null));
                    } catch (Exception e) {
                        //do nothing
                    }
                }
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
