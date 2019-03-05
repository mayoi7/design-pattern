package com.ushiro.demo.observer;

/**
 * 具体的观察者
 * @author Kripath
 * @date Created in 16:53 2019/3/5
 */
public class ConcreteObserver implements Observer {

    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int data) {
        System.out.println("观察者[" + name + "]收到数据改变的消息，数据改为[" + data + "]");
    }
}
