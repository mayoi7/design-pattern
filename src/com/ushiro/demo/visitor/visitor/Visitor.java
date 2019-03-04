package com.ushiro.demo.visitor.visitor;

import com.ushiro.demo.visitor.element.Weather;
import com.ushiro.demo.visitor.element.WeatherStatus;
import com.ushiro.demo.visitor.element.WeatherTemperature;

/**
 * 访问者，用于访问气象信息
 * @author Kripath
 * @date Created in 15:06 2019/3/4
 */
public interface Visitor {

    /**
     * 访问气象状态
     * @param weather 气象信息
     */
    void visit(WeatherStatus weather);

    /**
     * 访问当前温度
     * @param degree 温度信息
     */
    void visit(WeatherTemperature degree);
}
