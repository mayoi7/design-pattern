package com.ushiro.demo.factory;

/**
 * 类的名称枚举
 * @author Kripath
 * @date Created in 19:39 2019/3/1
 */
public enum AnimalNameEnum {

    /** 鸟 */
    BIRD("BIRD"),

    /** 人类 */
    HUMAN("HUMAN"),

    /** 老虎 */
    TIGER("TIGER");

    private final String name;

    private AnimalNameEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
