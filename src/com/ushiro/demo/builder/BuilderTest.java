package com.ushiro.demo.builder;

/**
 * 建造者模式的测试类
 * @author Kripath
 * @date Created in 8:23 2019/3/2
 */
public class BuilderTest {

    public static void main(String[] args) {
        // 先创建建造者
        Builder builder = new Builder();

        // 通过建造者创建对象
        BuildingObject building = Director.createBuildingDirector(builder);

        // 检查是否建造完成
        building.finishCheck();
    }
}
