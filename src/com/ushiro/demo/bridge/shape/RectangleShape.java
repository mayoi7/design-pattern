package com.ushiro.demo.bridge.shape;

import com.ushiro.demo.bridge.shape.Shape;

/**
 * 桥接类的扩展
 * @author Kripath
 * @date Created in 16:35 2019/3/2
 */
public class RectangleShape extends Shape {

    @Override
    public void draw() {
        System.out.print("[画一个矩形]");
        color.paint();
    }
}
