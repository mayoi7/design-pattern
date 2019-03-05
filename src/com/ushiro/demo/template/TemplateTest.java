package com.ushiro.demo.template;

/**
 * 模板模式的测试类
 * @author Kripath
 * @date Created in 8:53 2019/3/5
 */
public class TemplateTest {

    public static void main(String[] args) {

        Template teaMaker = new TeaMaker();
        teaMaker.makeDrink();
        System.out.println("---------------------------");
        Template juiceMaker = new JuiceMaker();
        juiceMaker.makeDrink();
    }
}
