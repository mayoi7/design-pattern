package com.ushiro.demo.template;

/**
 * 制作茶
 * @author Kripath
 * @date Created in 8:49 2019/3/5
 */
public class TeaMaker extends Template {

    @Override
    protected void addIngredients() {
        System.out.println("加入茶叶");
    }

    @Override
    protected void addCondiments() {

    }
}
