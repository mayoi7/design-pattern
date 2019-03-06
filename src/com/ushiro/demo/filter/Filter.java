package com.ushiro.demo.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器
 * @author Kripath
 * @date Created in 16:40 2019/3/6
 */
public abstract class Filter {

    List<Person> filter(List<Person> people) {
        List<Person> res = new ArrayList<>(people.size());
        for (Person person :people) {
            if(isKeep(person)) {
                res.add(person);
            }
        }
        return res;
    }

    /**
     * 定义过滤规则
     * @param person 被判断的对象
     * @return true：保留到下一层过滤器
     */
    abstract boolean isKeep(Person person);
}

/**
 * 年龄过滤器
 */
class AgeFilter extends Filter {

    @Override
    boolean isKeep(Person person) {
        int ageBound = 30;
        return person.age < ageBound;
    }
}

/**
 * 性别过滤器
 */
class GenderFilter extends Filter {

    @Override
    boolean isKeep(Person person) {
        return person.gender == Person.FEMALE;
    }
}