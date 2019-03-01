package com.ushiro.demo.factory.factory;

import com.ushiro.demo.factory.animal.Soundable;

/**
 * 工厂类的抽象类（非抽象工厂）
 * @author Kripath
 * @date Created in 20:25 2019/3/1
 */
public abstract class AbstractFactory {

    public abstract Soundable createAnimal();
}
