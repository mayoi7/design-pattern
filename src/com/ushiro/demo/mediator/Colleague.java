package com.ushiro.demo.mediator;

/**
 * 抽象同事类
 * @author Kripath
 * @date Created in 19:43 2019/3/5
 */
public abstract class Colleague {

    /**
     * 给其他所有人打电话
     */
    public abstract void callAll();

    /**
     * 接听电话
     */
    public abstract void getCall();
}
