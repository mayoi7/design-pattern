package com.ushiro.demo.template;

/**
 * 制作果汁
 * @author Kripath
 * @date Created in 8:49 2019/3/5
 */
public class JuiceMaker extends Template {

    @Override
    protected void addIngredients() {
        System.out.println("加入果汁粉");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖");
    }

    @Override
    protected boolean hook() {
        return true;
    }
}
