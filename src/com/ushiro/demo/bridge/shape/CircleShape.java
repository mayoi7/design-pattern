package com.ushiro.demo.bridge.shape;

/**
 * 桥接类的扩展
 * @author Kripath
 * @date Created in 16:38 2019/3/2
 */
public class CircleShape extends Shape {

    @Override
    public void draw() {
        System.out.print("[画一个圆形]");
        color.paint();
    }
}
