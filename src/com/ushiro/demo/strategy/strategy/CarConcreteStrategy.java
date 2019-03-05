package com.ushiro.demo.strategy.strategy;

import com.ushiro.demo.strategy.TravelStrategy;

/**
 * 具体的策略类，开车
 * @author Kripath
 * @date Created in 9:38 2019/3/5
 */
public class CarConcreteStrategy implements TravelStrategy {

    @Override
    public void travelWay() {
        System.out.println("开车去");
    }
}
