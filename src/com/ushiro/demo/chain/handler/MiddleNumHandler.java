package com.ushiro.demo.chain.handler;

import com.ushiro.demo.chain.Handler;
import com.ushiro.demo.chain.Request;

/**
 * 具体处理者，处理100以下的数字
 * @author Kripath
 * @date Created in 16:16 2019/3/6
 */
public class MiddleNumHandler extends Handler {

    public MiddleNumHandler(String name) {
        super(name);
    }

    @Override
    protected boolean canHandle(Request request) {
        return request.data < Handler.MIDDLE_NUM_BOUND;
    }
}
