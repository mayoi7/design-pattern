package com.ushiro.demo.flyweight;

/**
 * 具体享元角色
 * @author Kripath
 * @date Created in 16:22 2019/3/3
 */
public class NumConcreteFlyweight extends NumFlyweight {

    public NumConcreteFlyweight(Integer extrinsic) {
        this.extrinsic = extrinsic;
    }

    @Override
    public void show() {
        System.out.println("这是数字" + extrinsic);
    }
}
