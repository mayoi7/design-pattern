package com.ushiro.demo.mediator;

import com.ushiro.demo.mediator.colleague.ColleagueA;
import com.ushiro.demo.mediator.colleague.ColleagueB;
import com.ushiro.demo.mediator.colleague.ColleagueC;

/**
 * 中介者模式的测试类
 * @author Kripath
 * @date Created in 19:23 2019/3/5
 */
public class MediatorTest {

    public static void main(String[] args) {

        ColleagueA a = new ColleagueA();
        ColleagueB b = new ColleagueB();
        ColleagueC c = new ColleagueC();

        // 设置中介者
        Mediator mediator = new ConcreteMediator(a, b, c);
        a.setMediator(mediator);
        b.setMediator(mediator);
        c.setMediator(mediator);

        a.callAll();
        System.out.println("-------------------------------------");
        c.callAll();
    }
}
