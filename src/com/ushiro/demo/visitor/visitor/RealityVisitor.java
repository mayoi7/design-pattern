package com.ushiro.demo.visitor.visitor;

import com.ushiro.demo.visitor.element.Weather;
import com.ushiro.demo.visitor.element.WeatherStatus;
import com.ushiro.demo.visitor.element.WeatherTemperature;

/**
 * 访问者，现实的气象板
 * @author Kripath
 * @date Created in 18:59 2019/3/4
 */
public class RealityVisitor implements Visitor {

    @Override
    public void visit(WeatherStatus status) {
        System.out.println("修改[门口的气象板]上的[天气]信息为[" + status.getStatus() + "]");
    }

    @Override
    public void visit(WeatherTemperature degree) {
        System.out.println("修改[门口的气象板]上的[温度]信息为[" + degree.getDegree() + "℃]");
    }
}
