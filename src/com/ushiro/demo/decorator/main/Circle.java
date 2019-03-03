package com.ushiro.demo.decorator.main;

import com.ushiro.demo.decorator.AbstractShape;

/**
 * 主体
 * @author Kripath
 * @date Created in 9:25 2019/3/3
 */
public class Circle extends AbstractShape {

    @Override
    public String makeDesc() {
        return "圆形";
    }
}
