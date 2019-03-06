package com.ushiro.demo.iterator;

/**
 * 迭代器模式的测试类
 * @author Kripath
 * @date Created in 8:17 2019/3/6
 */
public class IteratorTest {

    public static void main(String[] args) {
        // 创建聚合类
        ConcreteAggregate aggregate = new ConcreteAggregate();
        // 创建迭代器
        Iterator iterator = aggregate.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
