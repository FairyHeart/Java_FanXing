package com.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型通配符
 *
 * @author: FairyHeart.
 * @date : 2020-04-20.
 */
class GenericByWildcard {

    /**
     * ? 指定了没有限制的泛型类型
     */
    public static void printFruit(Box<?> fruits) {
        System.out.println(fruits.toString());
    }

    /**
     * ? super X 表示类型的下界，类型参数是X的超类（包括X本身）
     */
    public static void printFruit2(Box<? super Fruit> fruits) {
        System.out.println(fruits.toString());
    }

    /**
     * ? extends X 表示类型的上界，类型参数是X的子类（包括X本身）
     */
    public static void printFruit3(Box<? extends Fruit> fruits) {
        System.out.println(fruits.toString());
    }

    public static void main(String[] args) {
        Food food = new Food();
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Food> foodBox = new Box<Food>();
        foodBox.add(food);
        Box<Fruit> fruitBox = new Box<Fruit>();
        fruitBox.add(fruit);
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.add(apple);
        Box<Orange> orangeBox = new Box<Orange>();
        orangeBox.add(orange);

        printFruit(foodBox);
        printFruit(fruitBox);
        printFruit(appleBox);

        printFruit2(foodBox);
        printFruit2(fruitBox);
//        printFruit2(appleBox);//超出下届

//        printFruit3(foodBox);//超出上界
        printFruit3(fruitBox);
        printFruit3(appleBox);
    }
}

class Food {
}

class Fruit extends Food {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}

//箱子
class Box<T> {

    private List<T> list = new ArrayList<T>();

    public void add(T t) {
        list.add(t);
    }

    @Override
    public String toString() {
        return "Box{" + "list=" + list + '}';
    }
}
