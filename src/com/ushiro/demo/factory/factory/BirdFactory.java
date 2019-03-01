package com.ushiro.demo.factory.factory;

import com.ushiro.demo.factory.animal.Soundable;
import com.ushiro.demo.factory.animal.Bird;

/**
 * 抽象工厂类
 * @author Kripath
 * @date Created in 20:26 2019/3/1
 */
public class BirdFactory extends AbstractFactory {

    @Override
    public Soundable createAnimal() {
        return new Bird();
    }
}
