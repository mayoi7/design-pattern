package com.ushiro.demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式
 * @author Kripath
 * @date Created in 16:51 2019/3/6
 */
public class FilterTest {

    public static void main(String[] args) {
        // 添加一个过滤器链
        FilterChain filterChain = new FilterChain();
        // 向过滤器中添加过滤器/链
        filterChain.addFilter(new AgeFilter());
        filterChain.addFilter(new GenderFilter());

        // 创建被过滤的对象集合
        List<Person> people = new ArrayList<>();
        people.add(new Person("小王", 25, 0));
        people.add(new Person("小刘", 18, 1));
        people.add(new Person("小李", 32, 0));
        people.add(new Person("小赵", 13, 1));
        people.add(new Person("小云", 20, 1));
        people.add(new Person("小红", 43, 0));
        people.add(new Person("小明", 22, 1));

        // 进行过滤，输出结果
        List<Person> result = filterChain.filter(people);
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓过滤结果↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        for (Person person :result) {
            System.out.println(person.toString());
        }
    }
}
