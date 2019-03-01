package com.ushiro.demo.factory.animal;

/**
 * @author Kripath
 * @date Created in 19:30 2019/3/1
 */
public class Bird implements Soundable {

    @Override
    public void say() {
        System.out.println("I am bird...");
    }
}
