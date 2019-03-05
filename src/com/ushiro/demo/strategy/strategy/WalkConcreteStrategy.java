package com.ushiro.demo.strategy.strategy;

import com.ushiro.demo.strategy.TravelStrategy;

/**
 * 具体的策略类，走路
 * @author Kripath
 * @date Created in 9:39 2019/3/5
 */
public class WalkConcreteStrategy implements TravelStrategy {

    @Override
    public void travelWay() {
        System.out.println("走路去");
    }
}
