package com.ushiro.demo.mediator;

import com.ushiro.demo.mediator.colleague.ColleagueA;
import com.ushiro.demo.mediator.colleague.ColleagueB;
import com.ushiro.demo.mediator.colleague.ColleagueC;

/**
 * 具体中介者
 * @author Kripath
 * @date Created in 19:57 2019/3/5
 */
public class ConcreteMediator extends Mediator {

    private ColleagueA colleagueA;

    private ColleagueB colleagueB;

    private ColleagueC colleagueC;

    public ConcreteMediator(ColleagueA colleagueA, ColleagueB colleagueB, ColleagueC colleagueC) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
        this.colleagueC = colleagueC;
    }

    @Override
    public void callOther(Colleague self) {
        if(ColleagueA.class.isInstance(self)) {
            colleagueB.getCall();
            colleagueC.getCall();
        } else if(ColleagueB.class.isInstance(self)) {
            colleagueA.getCall();
            colleagueC.getCall();
        } else if(ColleagueC.class.isInstance(self)) {
            colleagueA.getCall();
            colleagueB.getCall();
        } else {
            System.out.println("抱歉您打错了");
        }
    }
}
