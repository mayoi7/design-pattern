package com.ushiro.demo.utils;

/**
 * @author Kripath
 * @date Created in 11:11 2019/3/1
 */
public class ThreadCustomUtil {

    /**
     * 线程等待一段时间
     * @param time 等待的毫秒数
     */
    public static void waitForASec(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ignored) {}
    }
}
