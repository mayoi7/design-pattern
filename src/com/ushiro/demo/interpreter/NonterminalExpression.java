package com.ushiro.demo.interpreter;

/**
 * 非终止符表达式
 * @author Kripath
 * @date Created in 9:30 2019/3/6
 */
public abstract class NonterminalExpression extends AbstractExpression {

    protected AbstractExpression e1, e2;

    public NonterminalExpression(AbstractExpression e1, AbstractExpression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
}
