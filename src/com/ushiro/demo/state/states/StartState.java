package com.ushiro.demo.state.states;

import com.ushiro.demo.state.State;

/**
 * 具体状态类，起步状态
 * @author Kripath
 * @date Created in 10:28 2019/3/5
 */
public class StartState implements State {

    @Override
    public void run() {
        System.out.println("刚起步，跑的很慢");
    }
}
