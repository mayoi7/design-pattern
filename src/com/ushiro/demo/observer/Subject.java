package com.ushiro.demo.observer;

/**
 * 被观察者
 * @author Kripath
 * @date Created in 16:42 2019/3/5
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer 具体的观察者
     */
    void attach(Observer observer);

    /**
     * 移除观察者
     * @param observer 具体的观察者
     */
    void detach(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
