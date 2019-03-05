package com.ushiro.demo.observer;

/**
 * 观察者
 * @author Kripath
 * @date Created in 16:43 2019/3/5
 */
public interface Observer {

    /**
     * 更新信息，当被观察者状态改变时会自动调用该方法
     * @param data 改变后的数据
     */
    void update(int data);
}
