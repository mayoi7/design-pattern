package com.ushiro.demo.interpreter;

/**
 * @author Kripath
 * @date Created in 9:34 2019/3/6
 */
public class MinusExpression extends NonterminalExpression {

    public MinusExpression(AbstractExpression e1, AbstractExpression e2) {
        super(e1, e2);
    }

    @Override
    int interpreter(Context context) {
        return this.e1.interpreter(context) - this.e2.interpreter(context);
    }
}
