package com.ushiro.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * @author Kripath
 * @date Created in 18:24 2019/3/3
 */
public class BuyHouseDynamicProxy implements InvocationHandler {

    private Object object;

    public BuyHouseDynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("联系房源");
        Object result = method.invoke(object, args);
        System.out.println("处理其他手续");

        return result;
    }
}
