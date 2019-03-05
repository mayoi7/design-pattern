package com.ushiro.demo.strategy;

import com.ushiro.demo.strategy.strategy.CarConcreteStrategy;
import com.ushiro.demo.strategy.strategy.TrainConcreteStrategy;

/**
 * 策略模式的测试类
 * @author Kripath
 * @date Created in 9:34 2019/3/5
 */
public class StrategyTest {

    public static void main(String[] args) {
        // 创建具体的策略类
        TravelStrategy car = new CarConcreteStrategy();
        TravelStrategy train = new TrainConcreteStrategy();

        // 创建环境对象
        Context context = new Context(car);
        // 执行具体策略
        context.executeTravelAlgorithm();
        // 更换算法
        context.setStrategy(train);
        context.executeTravelAlgorithm();
    }
}
