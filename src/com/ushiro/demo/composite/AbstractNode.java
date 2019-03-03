package com.ushiro.demo.composite;

/**
 * 抽象构件
 * @author Kripath
 * @date Created in 8:38 2019/3/3
 */
public abstract class AbstractNode {

    protected String name;

    public abstract void add(AbstractNode node);

    public abstract void operate();
}
