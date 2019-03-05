package com.ushiro.demo.mediator;

/**
 * 中介者
 * @author Kripath
 * @date Created in 19:49 2019/3/5
 */
public abstract class Mediator {

    public abstract void callOther(Colleague self);
}
