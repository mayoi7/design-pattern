package com.ushiro.demo.bridge;

import com.ushiro.demo.bridge.color.BlueColor;
import com.ushiro.demo.bridge.color.Color;
import com.ushiro.demo.bridge.color.RedColor;
import com.ushiro.demo.bridge.shape.CircleShape;
import com.ushiro.demo.bridge.shape.RectangleShape;
import com.ushiro.demo.bridge.shape.Shape;

/**
 * 桥接模式测试
 * @author Kripath
 * @date Created in 16:39 2019/3/2
 */
public class BridgeTest {

    public static void main(String[] args) {
        Shape redRectangle = new RectangleShape();
        redRectangle.setColor(new RedColor());
        redRectangle.draw();

        Shape blueCircle = new CircleShape();
        blueCircle.setColor(new BlueColor());
        blueCircle.draw();
    }
}
