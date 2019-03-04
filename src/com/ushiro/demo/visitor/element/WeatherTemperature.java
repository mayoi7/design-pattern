package com.ushiro.demo.visitor.element;

import com.ushiro.demo.visitor.visitor.Visitor;

/**
 * 温度
 * @author Kripath
 * @date Created in 18:55 2019/3/4
 */
public class WeatherTemperature implements Weather {

    private double degree;

    public WeatherTemperature(double degree) {
        this.degree = degree;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }


}
