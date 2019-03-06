package com.ushiro.demo.chain.handler;

import com.ushiro.demo.chain.Handler;
import com.ushiro.demo.chain.Request;

/**
 * 具体处理者，处理10以下的数字
 * @author Kripath
 * @date Created in 16:09 2019/3/6
 */
public class SmallNumHandler extends Handler {

    public SmallNumHandler(String name) {
        super(name);
    }

    @Override
    protected boolean canHandle(Request request) {
        return request.data < Handler.SMALL_NUM_BOUND;
    }
}
