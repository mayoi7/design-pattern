package com.ushiro.demo.singleton;

/**
 * 单例模式-静态内部类实现
 * @author Kripath
 * @date Created in 18:51 2019/3/1
 */
public class Singleton6 {

    private Singleton6() {}

    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
