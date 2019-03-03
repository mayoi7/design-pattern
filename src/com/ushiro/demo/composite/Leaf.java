package com.ushiro.demo.composite;

/**
 * 叶子构件
 * @author Kripath
 * @date Created in 8:42 2019/3/3
 */
public class Leaf extends AbstractNode {

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractNode node) {
        System.out.println("---不支持---");
    }

    @Override
    public void operate() {
        System.out.println("[" + name + "] 执行操作");
    }
}
