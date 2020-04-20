package com.fanxing;

/**
 * 泛型类定义
 *
 * @author: FairyHeart.
 * @date : 2020-04-20.
 */
class GenericClass<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.setData("hello generic");
        System.out.println(genericClass.data);
    }
}
