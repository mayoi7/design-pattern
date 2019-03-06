package com.ushiro.demo.chain;

/**
 * 模拟请求类
 * @author Kripath
 * @date Created in 16:00 2019/3/6
 */
public class Request {

    /** 请求的数据，处理者根据数据特征判断是否能处理 */
    public final int data;

    public Request(int data) {
        this.data = data;
    }
}
