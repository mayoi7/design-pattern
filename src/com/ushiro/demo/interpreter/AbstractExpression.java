package com.ushiro.demo.interpreter;

/**
 * 抽象表达式
 * @author Kripath
 * @date Created in 9:19 2019/3/6
 */
public abstract class AbstractExpression {

    /**
     * 翻译词语
     * @param context 环境类，保存需要翻译的词语
     * @return 翻译出的句子
     */
    abstract int interpreter(Context context);
}
