package com.ushiro.demo.template;

/**
 * 模板类
 * @author Kripath
 * @date Created in 8:35 2019/3/5
 */
public abstract class Template {

    public final void makeDrink() {
        boilWater();
        addIngredients();
        if(hook()) {
            addCondiments();
        }
        pourIntoCup();
    }

    protected void boilWater() {
        System.out.println("将水煮沸");
    }

    /** 添加配料 */
    protected abstract void addIngredients();

    /** 添加调味品 */
    protected abstract void addCondiments();

    /**
     * 钩子方法，子类通过重写钩子方法即可干预父类中的算法逻辑
     * @return true: 加调料
     */
    protected boolean hook() { return false; }

    protected void pourIntoCup() {
        System.out.println("倒入杯子中");
    }
}
