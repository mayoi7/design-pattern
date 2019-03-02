package com.ushiro.demo.bridge.shape;

import com.ushiro.demo.bridge.color.Color;

/**
 * 作为桥接的接口
 * @author Kripath
 * @date Created in 16:22 2019/3/2
 */
public abstract class Shape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
