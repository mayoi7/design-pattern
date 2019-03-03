package com.ushiro.demo.facade;

/**
 * 外观模式的测试类
 * @author Kripath
 * @date Created in 15:26 2019/3/3
 */
public class FacadeTest {

    public static void main(String[] args) {
        Paint paint = new Paint();
        // 调用入口类的接口进行访问，屏蔽了复杂的子模块
        paint.paint();
    }
}
