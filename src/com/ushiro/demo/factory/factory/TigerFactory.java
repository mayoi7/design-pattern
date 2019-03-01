package com.ushiro.demo.factory.factory;

import com.ushiro.demo.factory.animal.Soundable;
import com.ushiro.demo.factory.animal.Tiger;

/**
 * @author Kripath
 * @date Created in 20:27 2019/3/1
 */
public class TigerFactory extends AbstractFactory {

    @Override
    public Soundable createAnimal() {
        return new Tiger();
    }
}
