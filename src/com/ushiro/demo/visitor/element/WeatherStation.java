package com.ushiro.demo.visitor.element;

import com.ushiro.demo.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象台
 * @author Kripath
 * @date Created in 15:05 2019/3/4
 */
public class WeatherStation implements Weather {

    /** 气象列表 */
    private List<Weather> infoList = new ArrayList<>();

    public void add(Weather weather) {
        infoList.add(weather);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Weather weather: infoList) {
            weather.accept(visitor);
        }
    }
}
