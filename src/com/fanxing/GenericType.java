package com.fanxing;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 获取泛型类型测试类
 *
 * @author: FairyHeart.
 * @date : 2020-04-20.
 */
class GenericType<T> {

    public T data;

    public static void main(String[] args) {
        GenericType<String> genericType = new GenericType<String>() {
        };
        Type superClass = genericType.getClass().getGenericSuperclass();
        System.out.println(superClass);//com.fanxing.GenericType<java.lang.String>
        //getActualTypeArguments 返回确切的泛型参数, 如Map<String, Integer>返回[String, Integer]
        Type type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
        ParameterizedType parameterizedType = (ParameterizedType) superClass;
        System.out.println(type);//class java.lang.String

        System.out.println(parameterizedType.getActualTypeArguments());//[Ljava.lang.reflect.Type;@4554617c
        System.out.println(parameterizedType.getRawType());//class com.fanxing.GenericType
        System.out.println(parameterizedType.getOwnerType());//null
    }
}
