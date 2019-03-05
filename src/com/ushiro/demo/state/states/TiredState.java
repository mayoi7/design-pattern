package com.ushiro.demo.state.states;

import com.ushiro.demo.state.State;

/**
 * 疲劳状态
 * @author Kripath
 * @date Created in 10:32 2019/3/5
 */
public class TiredState implements State {

    @Override
    public void run() {
        System.out.println("累了，速度减慢");
    }
}
