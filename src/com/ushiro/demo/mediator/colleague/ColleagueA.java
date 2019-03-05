package com.ushiro.demo.mediator.colleague;

import com.ushiro.demo.mediator.Colleague;
import com.ushiro.demo.mediator.Mediator;

/**
 * 具体同事类
 * @author Kripath
 * @date Created in 19:47 2019/3/5
 */
public class ColleagueA extends Colleague {

    /** 中介者 */
    private Mediator mediator;

    @Override
    public void callAll() {
        System.out.println("[A]通知[中介]");
        mediator.callOther(this);
    }

    @Override
    public void getCall() {
        System.out.println("[A]收到通知");
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
