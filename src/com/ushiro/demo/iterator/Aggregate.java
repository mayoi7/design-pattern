package com.ushiro.demo.iterator;

/**
 * 抽象聚合类
 * @author Kripath
 * @date Created in 8:31 2019/3/6
 */
public interface Aggregate {

    /**
     * 返回迭代器
     * @return 具体迭代器类
     */
    Iterator iterator();
}
