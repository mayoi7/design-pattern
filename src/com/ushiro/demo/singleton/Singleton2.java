package com.ushiro.demo.singleton;

/**
 * 单例模式-饿汉式<br>
 * 静态代码块实现
 * @author Kripath
 * @date Created in 10:33 2019/3/1
 */
public class Singleton2 {

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    private Singleton2() {}

    static Singleton2 getInstance() {
        return instance;
    }
}
