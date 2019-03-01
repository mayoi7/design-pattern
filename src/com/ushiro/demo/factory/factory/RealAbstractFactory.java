package com.ushiro.demo.factory.factory;

import com.ushiro.demo.factory.animal.Soundable;
import com.ushiro.demo.factory.food.Eatable;

/**
 * 抽象工厂类
 * @author Kripath
 * @date Created in 20:40 2019/3/1
 */
public interface RealAbstractFactory {

    Soundable createAnimal();

    Eatable createFood();
}
