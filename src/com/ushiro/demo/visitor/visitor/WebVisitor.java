package com.ushiro.demo.visitor.visitor;

import com.ushiro.demo.visitor.element.Weather;
import com.ushiro.demo.visitor.element.WeatherStatus;
import com.ushiro.demo.visitor.element.WeatherTemperature;

/**
 * 访问者的一个实体，网络气象板
 * @author Kripath
 * @date Created in 15:09 2019/3/4
 */
public class WebVisitor implements Visitor {

    @Override
    public void visit(WeatherStatus status) {
        System.out.println("修改[网站首页]上的[天气]信息为[" + status.getStatus() + "]");
    }

    @Override
    public void visit(WeatherTemperature degree) {
        System.out.println("修改[网站首页]上的[温度]信息为[" + degree.getDegree() + "℃]");
    }
}
