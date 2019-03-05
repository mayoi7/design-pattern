package com.ushiro.demo.memento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 负责人，负责管理备忘录
 * @author Kripath
 * @date Created in 18:33 2019/3/5
 */
public class Caretaker {

    private LinkedList<Memento> mementos = new LinkedList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    /**
     * 返回最近的存档
     * @return 最后一个记录
     */
    Memento getLast() {
        if(mementos.size() > 0) {
            return  mementos.getLast();
        }
        return null;
    }

    /**
     * 返回指定存档
     * @param index 存档编号
     * @return 第index个存档
     */
    Memento getIndexOf(int index) {
        if(index < mementos.size()) {
            return mementos.get(index);
        }
        return null;
    }
}
