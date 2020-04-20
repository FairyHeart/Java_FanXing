package com.fanxing;

/**
 * 泛型类型继承规则
 *
 * @author: FairyHeart.
 * @date : 2020-04-20.
 */
class GenericExtends<T> {
    public T data1;
    public T data2;

    public static void setData(GenericExtends<Father> genericExtends) {

    }

    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        GenericExtends<Father> fatherGeneric = new GenericExtends<Father>();
        GenericExtends<Son> sonGeneric = new GenericExtends<Son>();
        SubGenericExtends<Father> fatherSubGeneric = new SubGenericExtends<Father>();
        SubGenericExtends<Son> sonSubGeneric = new SubGenericExtends<Son>();

        /**
         * 对于传递的泛型类型是继承关系的泛型类之间是没有继承关系的
         * GenericExtends<Father> 与 GenericExtends<Son> 没有继承关系
         */
//        fatherGeneric = new GenericExtends<Son>();

        /**
         * 泛型类可以继承其它泛型类
         */
        fatherGeneric = new SubGenericExtends<Father>();

        /**
         *泛型类的继承关系在使用中同样会受到泛型类型的影响
         */
        setData(fatherGeneric);
//        setData(sonGeneric);
        setData(fatherSubGeneric);
//        setData(sonSubGeneric);
    }
}

class SubGenericExtends<T> extends GenericExtends<T> {
}

class Father {
}

class Son extends Father {
}

