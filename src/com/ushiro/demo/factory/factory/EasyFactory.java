package com.ushiro.demo.factory.factory;

import com.ushiro.demo.factory.AnimalNameEnum;
import com.ushiro.demo.factory.animal.Soundable;
import com.ushiro.demo.factory.animal.Bird;
import com.ushiro.demo.factory.animal.Human;
import com.ushiro.demo.factory.animal.Tiger;

/**
 * 简单工厂类
 * @author Kripath
 * @date Created in 19:33 2019/3/1
 */
public class EasyFactory {

    public Soundable createAnimal(String name) {
        if(AnimalNameEnum.BIRD.getName().equals(name)) {
            return new Bird();
        } else if(AnimalNameEnum.HUMAN.getName().equals(name)) {
            return new Human();
        } else if(AnimalNameEnum.TIGER.getName().equals(name)) {
            return new Tiger();
        } else {
            return null;
        }
    }
}
