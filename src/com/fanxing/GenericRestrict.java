package com.fanxing;

/**
 * 泛型的约束和局限性
 *
 * @author: FairyHeart.
 * @date : 2020-04-20.
 */
class GenericRestrict<T> {

    private T data;

    /**
     * 1.不能实例化泛型类
     */
    public void setData() {
//        this.data = new T();
    }

    /**
     * 2.静态变量或方法不能引用泛型类型变量
     */
//    private static T result;

//    private static T getResult() {
//        return result;
//    }

    /**
     * 静态泛型方法是可以的
     */
    private static <K> K getKey(K k) {
        return k;
    }

    public static void main(String[] args) {
        /**
         * 3.基本类型无法作为泛型类型
         */
//        GenericRestrict<int> genericRestrict = new GenericRestrict<int>();

        GenericRestrict<String> restrict1 = new GenericRestrict<String>();
        GenericRestrict<Integer> restrict2 = new GenericRestrict<Integer>();

        /**
         * 4.无法使用“==”判断两个泛型类的实例
         */
//        if (restrict1 == restrict2)

        /**
         * 无法使用instanceof关键字判断泛型类的类型
         */
//        if (restrict1 instanceof GenericRestrict<String>)


        /**
         * 5.泛型类的原生类型与所传递的泛型无关，无论传递什么类型，原生类是一样的
         */
        System.out.println(restrict1.getClass() == restrict2.getClass()); //true
        System.out.println(restrict1.getClass());//class com.fanxing.GenericRestrict
        System.out.println(restrict2.getClass());//class com.fanxing.GenericRestrict

        /**
         * 6.泛型数组可以声明但无法实例化
         */
        GenericRestrict<String>[] restricts;
//        restricts = new GenericRestrict<String>[10];
        restricts = new GenericRestrict[10];
        restricts[0] = restrict1;
    }


    /**
     * 不能捕获泛型类型限定的异常
     */
    public <T extends Exception> void getException(T t) {
//        try {
//        } catch (T e) {
//        }
    }

    /**
     * 可以将泛型限定的异常抛出
     */
    public <T extends Throwable> void getException(T t) throws T {
        try {
        } catch (Exception e) {
            throw t;
        }
    }
}

/**
 * 7.泛型类不能继承Exception或者Throwable
 */
//class GenericRestrict2<T> extends Exception {
//}

//class GenericRestrict2<T> extends Throwable {
//}
