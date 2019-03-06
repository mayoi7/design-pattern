package com.ushiro.demo.iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author Kripath
 * @date Created in 8:33 2019/3/6
 */
public class ConcreteAggregate implements Aggregate {

    private String[] elements = {"第一个元素", "第二个元素", "第三个元素"};

    private int size = 3;

    @Override
    public Iterator iterator() {
        return new ConcreteIterator();
    }

    /**
     * 具体迭代器
     */
    private class ConcreteIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index != size;
        }

        @Override
        public Object next() {
            if(index < size) {
                return elements[index++];
            }
            throw new NoSuchElementException();
        }
    }
}
