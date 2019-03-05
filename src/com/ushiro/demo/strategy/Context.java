package com.ushiro.demo.strategy;

/**
 * 环境类，持有具体的策略类对象
 * @author Kripath
 * @date Created in 9:43 2019/3/5
 */
public class Context {

    private TravelStrategy strategy;

    public Context(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeTravelAlgorithm() {
        strategy.travelWay();
    }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }
}
