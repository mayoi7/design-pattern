package com.ushiro.demo.flyweight;

/**
 * 享元模式的测试类
 * @author Kripath
 * @date Created in 16:10 2019/3/3
 */
public class FlyweightTest {

    public static void main(String[] args) {
        NumFlyweightFactory.getNum(1);
        NumFlyweightFactory.getNum(2);
        NumFlyweightFactory.getNum(1);
        NumFlyweightFactory.getNum(1);
    }
}
