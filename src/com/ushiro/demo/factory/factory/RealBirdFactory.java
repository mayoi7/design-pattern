package com.ushiro.demo.factory.factory;

import com.ushiro.demo.factory.animal.Bird;
import com.ushiro.demo.factory.animal.Soundable;
import com.ushiro.demo.factory.food.Eatable;
import com.ushiro.demo.factory.food.Worm;

/**
 * 创建动物对象和它吃的食物的工厂类
 * @author Kripath
 * @date Created in 20:47 2019/3/1
 */
public class RealBirdFactory implements RealAbstractFactory {
    @Override
    public Soundable createAnimal() {
        return new Bird();
    }

    @Override
    public Eatable createFood() {
        return new Worm();
    }
}
