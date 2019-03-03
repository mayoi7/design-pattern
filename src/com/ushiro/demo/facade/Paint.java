package com.ushiro.demo.facade;

import com.ushiro.demo.facade.module.Border;
import com.ushiro.demo.facade.module.Color;
import com.ushiro.demo.facade.module.Shadow;

/**
 * 入口类，将画一幅画的步骤进行封装
 * @author Kripath
 * @date Created in 15:31 2019/3/3
 */
public class Paint {

    private Border border;

    private Color color;

    private Shadow shadow;

    public Paint() {
        border = new Border();
        color = new Color();
        shadow = new Shadow();
    }

    public void paint() {
        System.out.println("--- start painting ---");

        border.drawBorder();
        color.paintColor();
        shadow.drawShadow();

        System.out.println("--- end painting ---");
    }
}
