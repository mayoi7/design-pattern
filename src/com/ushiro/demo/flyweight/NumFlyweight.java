package com.ushiro.demo.flyweight;

/**
 * 抽象享元类，对数字进行抽象
 * @author Kripath
 * @date Created in 16:20 2019/3/3
 */
public abstract class NumFlyweight {

    /** 外部状态 */
    protected Integer extrinsic;

    public abstract void show();
}
