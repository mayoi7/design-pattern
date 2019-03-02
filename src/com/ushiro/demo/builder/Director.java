package com.ushiro.demo.builder;

import com.ushiro.demo.builder.Builder;
import com.ushiro.demo.builder.BuildingObject;

/**
 * 启动建造过程的类
 * @author Kripath
 * @date Created in 8:20 2019/3/2
 */
public class Director {

    public static BuildingObject createBuildingDirector(Builder builder) {
        builder.buildBase();
        builder.buildFrame();
        builder.buildBody();

        return builder.getBuilding();
    }
}
