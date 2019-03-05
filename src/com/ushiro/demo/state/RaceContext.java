package com.ushiro.demo.state;

import com.ushiro.demo.state.states.AccelerationState;
import com.ushiro.demo.state.states.SprintState;
import com.ushiro.demo.state.states.StartState;
import com.ushiro.demo.state.states.TiredState;

/**
 * 环境类，负责状态更换以及修改行为
 * @author Kripath
 * @date Created in 10:35 2019/3/5
 */
public class RaceContext {

    private final State start = new StartState();

    private final State accelerate = new AccelerationState();

    private final State tired = new TiredState();

    private final State sprint = new SprintState();

    /** 默认状态是起步状态 */
    private State current = start;

    /** 剩余距终点的距离 */
    volatile int remainMeters = 10;

    /**
     * 自动更改状态
     */
    public void runAuto() {
        new Thread() {
            @Override
            public void run() {
                while(remainMeters > 0) {
                    current.run();
                    remainMeters = remainMeters - 1;

                    if(remainMeters > 8) {
                        current = start;
                    } else if(remainMeters > 5) {
                        current = accelerate;
                    } else if(remainMeters > 2) {
                        current = tired;
                    } else if(remainMeters > 0) {
                        current = sprint;
                    }
                }
            }
        }.start();
    }

    /**
     * 手动更改状态
     * @param current 当前状态
     */
    public void runManual(State current) {
        this.current = current;
        current.run();
    }
}
