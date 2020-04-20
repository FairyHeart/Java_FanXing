package com.fanxing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 类型变量的限定
 *
 * @author: FairyHeart.
 * @date : 2020-04-20.
 */
class GenericLimit<E extends List & Serializable> {

    public E data;

    //类型变量的限定-方法
    public static <T extends Comparable<T>> T getMin(T a, T b) {
        return (a.compareTo(b) < 0) ? a : b;
    }

    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();
        lists.add("a");

        GenericLimit method = new GenericLimit();
        method.data = lists;
    }
}
