package com.ushiro.demo.builder;

import com.ushiro.demo.builder.building.Buildable;

/**
 * 建筑物对象，需要构建的复杂对象
 * @author Kripath
 * @date Created in 8:06 2019/3/2
 */
public class BuildingObject {

    private Buildable base;

    private Buildable frame;

    private Buildable body;

    public Buildable getBase() {
        return base;
    }

    void setBase(Buildable base) {
        this.base = base;
    }

    public Buildable getFrame() {
        return frame;
    }

    void setFrame(Buildable frame) {
        this.frame = frame;
    }

    public Buildable getBody() {
        return body;
    }

    void setBody(Buildable body) {
        this.body = body;
    }

    void finishCheck() {
        if(base == null || frame == null && body == null) {
            System.out.println("未建造完成");
        } else {
            System.out.println("建造完成");
        }
    }
}
