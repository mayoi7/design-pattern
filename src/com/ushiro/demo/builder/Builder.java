package com.ushiro.demo.builder;

import com.ushiro.demo.builder.building.Base;
import com.ushiro.demo.builder.building.Body;
import com.ushiro.demo.builder.building.Frame;

/**
 * @author Kripath
 * @date Created in 8:01 2019/3/2
 */
public class Builder {

    /** 待构建的复杂对象 */
    private BuildingObject building;

    public Builder() {
        building = new BuildingObject();
    }

    void buildBase() {
        building.setBase(new Base());
    }

    void buildFrame() {
        building.setFrame(new Frame());
    }

    void buildBody() {
        building.setBody(new Body());
    }

    public BuildingObject getBuilding() {
        return building;
    }
}
