package com.ushiro.demo.interpreter;

/**
 * 终止符表达式，可以单独翻译成句子的表达式
 * @author Kripath
 * @date Created in 9:24 2019/3/6
 */
public class TerminalExpression extends AbstractExpression {

    private String param;

    public TerminalExpression(String param) {
        this.param = param;
    }

    @Override
    int interpreter(Context context) {
        return context.get(this);
    }
}
