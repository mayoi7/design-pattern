package com.ushiro.demo.state.states;

import com.ushiro.demo.state.State;

/**
 * 具体状态类，加速状态
 * @author Kripath
 * @date Created in 10:31 2019/3/5
 */
public class AccelerationState implements State {

    @Override
    public void run() {
        System.out.println("开始加速，速度很快");
    }
}
