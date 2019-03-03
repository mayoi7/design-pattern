package com.ushiro.demo.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * @author Kripath
 * @date Created in 16:25 2019/3/3
 */
public class NumFlyweightFactory {

    private static Map<Integer, NumFlyweight> pool = new HashMap<>();

    public static NumFlyweight getNum(Integer num) {
        NumFlyweight flyweight = null;

        if(pool.containsKey(num)) {
            // 如果池中有该对象，就直接获取该对象
            flyweight = pool.get(num);
            System.out.println("从池中获取 => " + num);
        } else {
            // 如果没有就根据外部状态新建对象
            flyweight = new NumConcreteFlyweight(num);
            // 放入池中
            pool.put(num, flyweight);
            System.out.println("新建，并放入池中 => " + num);
        }

        return flyweight;
    }
}
