package com.ushiro.demo.state;

import com.ushiro.demo.state.states.AccelerationState;
import com.ushiro.demo.state.states.SprintState;
import com.ushiro.demo.state.states.StartState;

/**
 * 状态模式的测试类
 * @author Kripath
 * @date Created in 10:20 2019/3/5
 */
public class StateTest {

    public static void runAuto() {
        // 创建环境对象
        RaceContext context = new RaceContext();

        context.runAuto();
    }

    public static void runManual() {
        // 创建环境对象
        RaceContext context = new RaceContext();

        context.runManual(new StartState());
        context.runManual(new AccelerationState());
        context.runManual(new SprintState());
    }

    public static void main(String[] args) {

        runAuto();
//        runManual();
    }
}
