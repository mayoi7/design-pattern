package com.ushiro.demo.visitor.element;

import com.ushiro.demo.visitor.visitor.Visitor;

/**
 * 天气状态（晴、阴、雨等）
 * @author Kripath
 * @date Created in 18:44 2019/3/4
 */
public class WeatherStatus implements Weather {

    /** 天气状态 */
    private String status;

    public WeatherStatus(String status) {
        this.status = status;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
