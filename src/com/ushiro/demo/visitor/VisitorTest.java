package com.ushiro.demo.visitor;

import com.ushiro.demo.visitor.element.WeatherStation;
import com.ushiro.demo.visitor.element.WeatherStatus;
import com.ushiro.demo.visitor.element.WeatherTemperature;
import com.ushiro.demo.visitor.visitor.RealityVisitor;
import com.ushiro.demo.visitor.visitor.Visitor;
import com.ushiro.demo.visitor.visitor.WebVisitor;

/**
 * 访问者模式的测试类
 * @author Kripath
 * @date Created in 14:49 2019/3/4
 */
public class VisitorTest {

    public static void main(String[] args) {
        // 建立气象站
        WeatherStation station = new WeatherStation();

        // 添加两种天气信息
        station.add(new WeatherStatus("晴天"));
        station.add(new WeatherTemperature(26));

        // 添加两种访问者
        Visitor webVisitor = new WebVisitor();
        Visitor realityVisitor = new RealityVisitor();

        // 现实气象板来访问
        station.accept(realityVisitor);

        System.out.println("--------------------------------------------------");

        // 网站气象板来访问
        station.accept(webVisitor);
    }
}
