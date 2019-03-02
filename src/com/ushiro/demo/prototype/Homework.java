package com.ushiro.demo.prototype;

/**
 * 需要大量复制的对象原型
 * @author Kripath
 * @date Created in 10:03 2019/3/2
 */
public class Homework implements Cloneable {

    private String name;

    private String content;

    public Homework(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void show() {
        System.out.println("[name: " + name + ", content: " + content + "]");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Homework clone() {
        Homework clone = null;
        try {
            clone = (Homework)super.clone();
        } catch (CloneNotSupportedException ignored) {}
        return clone;
    }
}
