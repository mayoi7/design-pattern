package com.ushiro.demo.observer;

/**
 * 观察者模式的测试类
 * @author Kripath
 * @date Created in 16:39 2019/3/5
 */
public class ObserverTest {

    public static void main(String[] args) {

        // 创建被观察者
        ConcreteSubject observed = new ConcreteSubject();

        // 创建观察者
        Observer observer1 = new ConcreteObserver("A");
        Observer observer2 = new ConcreteObserver("B");

        // 添加观察者
        observed.attach(observer1);
        observed.attach(observer2);

        // 改变状态
        observed.updateData(26);

        observed.detach(observer1);
        System.out.println("--------移除了一个观察者--------");
        observed.updateData(32);
    }
}
