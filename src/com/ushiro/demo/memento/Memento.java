package com.ushiro.demo.memento;

/**
 * 备忘录，负责保存状态
 * @author Kripath
 * @date Created in 18:33 2019/3/5
 */
public class Memento {

    private int data;

    public Memento(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
