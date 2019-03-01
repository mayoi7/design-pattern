package com.ushiro.demo.singleton;

import com.ushiro.demo.utils.ThreadCustomUtil;

/**
 * 单例模式-懒汉式<br>
 * 懒加载，线程不安全
 * @author Kripath
 * @date Created in 10:38 2019/3/1
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {}

    static Singleton3 getInstance() {
        if(instance == null) {
            // 多线程同时访问，为了使效果明显增加了一段等待时间
            ThreadCustomUtil.waitForASec(100);

            instance = new Singleton3();
        }

        return instance;
    }
}
