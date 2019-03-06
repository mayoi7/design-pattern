package com.ushiro.demo.filter;

/**
 * 被过滤的对象
 * @author Kripath
 * @date Created in 16:34 2019/3/6
 */
public class Person {

    public final static int MALE = 0;

    public final static int FEMALE = 1;

    final String name;

    final int age;

    final int gender;

    public Person(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String gender = this.gender == MALE ? "男" : "女";
        return "姓名[" + name + "]-年龄[" + age + "]-性别[" + gender + "]";
    }
}
