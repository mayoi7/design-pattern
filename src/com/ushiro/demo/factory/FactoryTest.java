package com.ushiro.demo.factory;

import com.ushiro.demo.factory.animal.Soundable;
import com.ushiro.demo.factory.factory.*;

/**
 * 工厂模式的测试类
 * @author Kripath
 * @date Created in 19:48 2019/3/1
 */
public class FactoryTest {

    /**
     * 简单工厂测试
     */
    private static void easyFactoryTest() {
        EasyFactory easyFactory = new EasyFactory();

        Soundable firstAnimal = easyFactory.createAnimal("BIRD");
        Soundable secondAnimal = easyFactory.createAnimal("HUMAN");
        Soundable thirdAnimal = easyFactory.createAnimal("TIGER");

        System.out.print("firstAnimal say: ");
        firstAnimal.say();

        System.out.print("secondAnimal say: ");
        secondAnimal.say();

        System.out.print("thirdAnimal say: ");
        thirdAnimal.say();
    }

    /**
     * 静态工厂测试
     */
    private static void staticFactoryTest() {
        Soundable firstAnimal = StaticFactory.createBird();
        Soundable secondAnimal = StaticFactory.createHuman();
        Soundable thirdAnimal = StaticFactory.createTiger();

        System.out.print("firstAnimal say: ");
        firstAnimal.say();

        System.out.print("secondAnimal say: ");
        secondAnimal.say();

        System.out.print("thirdAnimal say: ");
        thirdAnimal.say();
    }

    /**
     * 普通工厂测试
     */
    private static void normalFactoryTest() {
        AbstractFactory birdFactory = new BirdFactory();
        AbstractFactory tigerFactory = new TigerFactory();

        Soundable bird = birdFactory.createAnimal();
        Soundable tiger = tigerFactory.createAnimal();

        System.out.print("bird say: ");
        bird.say();

        System.out.print("tiger say: ");
        tiger.say();
    }

    public static void main(String[] args) {
//        easyFactoryTest();
        normalFactoryTest();
//        staticFactoryTest();
//        abstractFactoryTest();
    }
}
