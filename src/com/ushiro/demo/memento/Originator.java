package com.ushiro.demo.memento;

import java.util.Random;

/**
 * 原发器，需要保存的对象
 * @author Kripath
 * @date Created in 18:33 2019/3/5
 */
public class Originator {

    private int data = 0;

    /**
     * 更新数据
     */
    public void update() {
        Random random = new Random();
        data = random.nextInt(10);
        System.out.println("数据更新为[" + data + "]");
    }

    public Memento save() {
        System.out.println("保存数据");
        return new Memento(data);
    }

    /**
     * 恢复数据
     * @param memento 历史状态的备忘录
     */
    public void restore(Memento memento) {
        data = memento.getData();
        System.out.println("恢复数据为[" + data + "]");
    }
}
