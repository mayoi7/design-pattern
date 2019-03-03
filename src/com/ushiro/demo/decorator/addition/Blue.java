package com.ushiro.demo.decorator.addition;

import com.ushiro.demo.decorator.AbstractShape;

/**
 * 装饰者
 * @author Kripath
 * @date Created in 9:28 2019/3/3
 */
public class Blue extends AbstractShape {

    private AbstractShape shape;

    public Blue(AbstractShape shape) {
        this.shape = shape;
    }

    @Override
    public String makeDesc() {
        return shape.makeDesc() + "-涂一次蓝色";
    }
}
