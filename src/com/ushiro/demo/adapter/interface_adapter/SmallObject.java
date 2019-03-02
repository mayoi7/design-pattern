package com.ushiro.demo.adapter.interface_adapter;

/**
 * 继承了接口适配器，所以不需要实现全部方法
 * @author Kripath
 * @date Created in 11:13 2019/3/2
 */
public class SmallObject extends InterfaceAdapter {

    @Override
    public void func2() {
        System.out.println("only implement the second method...");
    }

}
