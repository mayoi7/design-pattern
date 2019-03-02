package com.ushiro.demo.bridge.color;

import com.ushiro.demo.bridge.color.Color;

/**
 * 颜色接口的实现类
 * @author Kripath
 * @date Created in 16:30 2019/3/2
 */
public class RedColor implements Color {

    @Override
    public void paint() {
        System.out.println("[涂上红色]");
    }
}
