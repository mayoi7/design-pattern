package com.ushiro.demo.singleton;

import com.ushiro.demo.utils.ThreadCustomUtil;

/**
 * 单例模式-懒汉式<br/>
 * 既满足延迟加载，又保证了线程安全，相比于单同步锁的实现提高了效率
 * @author Kripath
 * @date Created in 11:07 2019/3/1
 */
public class Singleton5 {
    private static volatile Singleton5 instance;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (instance == null) {
            // 多线程同时访问，为了使效果明显增加了一段等待时间
            ThreadCustomUtil.waitForASec(100);

            synchronized (Singleton5.class) {
                if (instance == null) {
                    // 多线程同时访问，为了使效果明显增加了一段等待时间
                    ThreadCustomUtil.waitForASec(100);

                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
