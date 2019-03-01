package com.ushiro.demo.singleton;

import com.ushiro.demo.utils.ThreadCustomUtil;

/**
 * 单例模式-懒汉式<br>
 * 线程安全的实现，但是效率低
 * @author Kripath
 * @date Created in 10:59 2019/3/1
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {}

    static synchronized Singleton4 getInstance() {
        if (instance == null) {
            // 多线程同时访问，为了使效果明显增加了一段等待时间
            ThreadCustomUtil.waitForASec(100);

            instance = new Singleton4();
        }
        return instance;
    }
}
