package com.ushiro.demo.proxy;

import com.ushiro.demo.proxy.BuyHouseSubject;

/**
 * 静态代理对象
 * @author Kripath
 * @date Created in 18:19 2019/3/3
 */
public class BuyHouseStaticProxy implements BuyHouseSubject {

    private BuyHouseSubject subject;

    public BuyHouseStaticProxy(BuyHouseSubject subject) {
        this.subject = subject;
    }

    @Override
    public void buyHouse() {
        System.out.println("联系房源");
        subject.buyHouse();
        System.out.println("处理其他手续");
    }
}
