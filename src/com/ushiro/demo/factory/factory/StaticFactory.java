package com.ushiro.demo.factory.factory;

import com.ushiro.demo.factory.animal.Soundable;
import com.ushiro.demo.factory.animal.Bird;
import com.ushiro.demo.factory.animal.Human;
import com.ushiro.demo.factory.animal.Tiger;

/**
 * 静态工厂
 * @author Kripath
 * @date Created in 20:18 2019/3/1
 */
public class StaticFactory {

    public static Soundable createBird() {
        return new Bird();
    }

    public static Soundable createHuman() {
        return new Human();
    }

    public static Soundable createTiger() {
        return new Tiger();
    }
}
