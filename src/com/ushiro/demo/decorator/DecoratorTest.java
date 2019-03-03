package com.ushiro.demo.decorator;

import com.ushiro.demo.decorator.addition.Blue;
import com.ushiro.demo.decorator.addition.Red;
import com.ushiro.demo.decorator.main.Rectangle;

/**
 * 装饰者模式的测试类
 * @author Kripath
 * @date Created in 9:20 2019/3/3
 */
public class DecoratorTest {

    public static void main(String[] args) {

        AbstractShape rectangle = new Rectangle();
        rectangle = new Blue(rectangle);
        rectangle = new Red(rectangle);

        System.out.println(rectangle.makeDesc());
    }
}
