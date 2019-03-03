package com.ushiro.demo.proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式测试类
 * @author Kripath
 * @date Created in 16:39 2019/3/3
 */
public class ProxyTest {

    /**
     * 静态代理
     */
    private static void staticProxy() {
        BuyHouseSubject proxy = new BuyHouseStaticProxy(new BuyHouseRealSubject());
        proxy.buyHouse();
    }

    /**
     * 动态代理
     */
    private static void dynamicProxy() {

        /*
        第一个参数：指定类加载器
        第二个参数：指定目标对象实现的接口类型
        第三个参数：指定动态处理器，当执行目标对象的方法时，会触发事件处理器的方法
         */
        BuyHouseSubject proxy = (BuyHouseSubject) Proxy.newProxyInstance(
                BuyHouseSubject.class.getClassLoader(),
                new Class[] {BuyHouseSubject.class},
                new BuyHouseDynamicProxy(new BuyHouseRealSubject()));
        proxy.buyHouse();
    }

    public static void main(String[] args) {
//        staticProxy();
        dynamicProxy();
    }
}
