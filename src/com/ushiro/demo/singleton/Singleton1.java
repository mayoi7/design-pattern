package com.ushiro.demo.singleton;

/**
 * 单例模式-饿汉式<br>
 * 避免了线程同步问题，但是如果一直未使用会造成内存的浪费
 * @author Kripath
 * @date Created in 10:22 2019/3/1
 */
public class Singleton1 {

    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    static Singleton1 getInstance() {
        return INSTANCE;
    }
}
