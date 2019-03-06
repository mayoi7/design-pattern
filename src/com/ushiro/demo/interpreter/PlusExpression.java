package com.ushiro.demo.interpreter;

/**
 * @author Kripath
 * @date Created in 9:24 2019/3/6
 */
public class PlusExpression extends NonterminalExpression {

    public PlusExpression(AbstractExpression e1, AbstractExpression e2) {
        super(e1, e2);
    }

    @Override
    int interpreter(Context context) {
        return this.e1.interpreter(context) + this.e2.interpreter(context);
    }
}
