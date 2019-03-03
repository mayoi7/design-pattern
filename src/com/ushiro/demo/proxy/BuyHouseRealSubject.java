package com.ushiro.demo.proxy;

/**
 * 真实主题角色，目的是增强这个类
 * @author Kripath
 * @date Created in 18:16 2019/3/3
 */
public class BuyHouseRealSubject implements BuyHouseSubject {

    @Override
    public void buyHouse() {
        System.out.println("从卖家手里买房");
    }
}
