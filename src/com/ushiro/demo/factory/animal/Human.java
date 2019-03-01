package com.ushiro.demo.factory.animal;

/**
 * @author Kripath
 * @date Created in 19:32 2019/3/1
 */
public class Human implements Soundable {
    @Override
    public void say() {
        System.out.println("I am human...");
    }
}
