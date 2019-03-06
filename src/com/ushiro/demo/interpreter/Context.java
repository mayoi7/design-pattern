package com.ushiro.demo.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境类(相当于字典)，负责保存词语
 * @author Kripath
 * @date Created in 9:21 2019/3/6
 */
public class Context {

    private Map<AbstractExpression, Integer> map = new HashMap<>();

    void add(AbstractExpression exp, Integer value) {
        map.put(exp, value);
    }

    int get(AbstractExpression exp) {
        return map.get(exp);
    }
}
