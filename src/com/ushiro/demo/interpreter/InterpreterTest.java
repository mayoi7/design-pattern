package com.ushiro.demo.interpreter;

/**
 * 解释器模式，实现一个支持加减运算的计算器
 * @author Kripath
 * @date Created in 8:50 2019/3/6
 */
public class InterpreterTest {

    public static void main(String[] args) {
        // 创建环境类
        Context context = new Context();

        // 创建终止符表达式
        TerminalExpression a = new TerminalExpression("a");
        TerminalExpression b = new TerminalExpression("b");
        TerminalExpression c = new TerminalExpression("c");

        // 添加对应关系
        context.add(a, 1);
        context.add(b, 2);
        context.add(c, 3);

        // 创建表达式：b + c - a
        AbstractExpression expression = new MinusExpression(new PlusExpression(b, c), a);
        // 传入环境类，进行翻译
        System.out.println(expression.interpreter(context));
    }
}
