package com.ushiro.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者，负责当状态改变时通知观察者
 * @author Kripath
 * @date Created in 16:47 2019/3/5
 */
public class ConcreteSubject implements Subject {

    /** 对当前对象进行观察的观察者 */
    private List<Observer> observers = new ArrayList<>();

    /** 数据，当改变时需要通知给观察者 */
    private int data = 0;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if(observers.size() > 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer :observers) {
            observer.update(data);
        }
    }

    public void updateData(int newData) {
        data = newData;
        System.out.println("数据改变了，原数据改为[" + data + "]");
        notifyObservers();
    }
}
