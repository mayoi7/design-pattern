package com.ushiro.demo.visitor.element;

import com.ushiro.demo.visitor.visitor.Visitor;

/**
 * 气象接口
 * @author Kripath
 * @date Created in 15:05 2019/3/4
 */
public interface Weather {

    /**
     * 接受访问者，用于访问本对象
     * @param visitor 访问者
     */
    void accept(Visitor visitor);
}
