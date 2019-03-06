package com.ushiro.demo.chain;

import com.ushiro.demo.chain.handler.BigNumHandler;
import com.ushiro.demo.chain.handler.MiddleNumHandler;
import com.ushiro.demo.chain.handler.SmallNumHandler;

/**
 * 责任链模式
 * @author Kripath
 * @date Created in 15:35 2019/3/6
 */
public class ResponsibilityChainTest {

    public static void main(String[] args) {
        // 创建责任链
        Handler handler = new SmallNumHandler("SMALL_NUM_HANDLER");
        handler.setNext(new MiddleNumHandler("MIDDLE_NUM_HANDLER"))
                .setNext(new BigNumHandler("BIG_NUM_HANDLER"));

        // 创建具体的请求
        Request request1 = new Request(32);
        // 将请求发给责任链
        handler.enterChain(request1);

        Request request2 = new Request(765);
        handler.enterChain(request2);

        Request request3 = new Request(5213);
        handler.enterChain(request3);
    }
}
