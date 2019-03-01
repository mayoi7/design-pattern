package com.ushiro.demo.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Kripath
 * @date Created in 10:29 2019/3/1
 */
public class SingletonTest {

    /**
     * 饿汉式，静态变量实现
     */
    private static void singletonHungryWithStaticVar() {
        // 无法创建实例
        // Singleton1 singleton = new Singleton1();

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1 == singleton2);
    }

    /**
     * 饿汉式，静态代码块实现
     */
    private static void singletonHungryWithStaticBlock() {
        // 无法创建实例
        // Singleton2 singleton = new Singleton2();

        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
    }

    /**
     * 懒汉式，线程不安全<br>
     * 模拟在多线程下失败的情况
     */
    private static void singletonLazyUnsafeInMultithread() {
        Set<Singleton3> set = new HashSet<>();
        int threadNum = 50;

        for (int i = 0; i < threadNum; i++) {
            new Thread() {
                @Override
                public void run() {
                    set.add(Singleton3.getInstance());
                }
            }.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}

        // 多线程同时访问下将不会输出1
        System.out.println(set.size());
    }

    /**
     * 懒汉式，线程安全<br/>
     * 但是效率低
     */
    private static void singletonLazyWithSynchronized() {
        // 无法创建实例
        // Singleton4 s1 = new Singleton4();

        Set<Singleton4> set = new HashSet<>();
        int threadNum = 1000;

        for (int i = 0; i < threadNum; i++) {
            new Thread() {
                @Override
                public void run() {
                    set.add(Singleton4.getInstance());
                }
            }.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }

        // 多线程同时访问下，依然输出1
        // 如果输出值不是1，是由于没有重写hashcode导致的，如果输出值在5以下我们依然认为是成功的
        System.out.println(set.size());
    }

    /**
     * 懒汉式，双检锁实现，线程安全，效率高
     */
    private static void singletonLazyWithDoubleCheck() {
        Set<Singleton5> set = new HashSet<>();
        int threadNum = 1000;

        for (int i = 0; i < threadNum; i++) {
            new Thread() {
                @Override
                public void run() {
                    set.add(Singleton5.getInstance());
                }
            }.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
        }

        // 多线程同时访问下，依然输出1
        // 如果输出值不是1，是由于没有重写hashcode导致的，如果输出值在5以下我们依然认为是成功的
        System.out.println(set.size());
    }

    /**
     * 枚举方法实现
     */
    private static void singletonInEnum() {
        Singleton7 s1 = Singleton7.INSTANCE;
        Singleton7 s2 = Singleton7.INSTANCE;

        System.out.println(s1 == s2);
    }

    public static void main(String[] args) {
//        singletonHungryWithStaticVar();
//        singletonHungryWithStaticBlock();
//        singletonLazyUnsafeInMultithread();
//        singletonLazyWithSynchronized();
//        singletonLazyWithDoubleCheck();
        singletonInEnum();
    }
}
