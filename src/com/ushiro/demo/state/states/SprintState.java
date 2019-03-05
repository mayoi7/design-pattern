package com.ushiro.demo.state.states;

import com.ushiro.demo.state.State;

/**
 * 冲刺状态
 * @author Kripath
 * @date Created in 10:34 2019/3/5
 */
public class SprintState implements State {

    @Override
    public void run() {
        System.out.println("开始冲刺，速度最快");
    }
}
