package com.ushiro.demo.chain;

/**
 * 抽象处理类
 * @author Kripath
 * @date Created in 15:57 2019/3/6
 */
public abstract class Handler {

    protected final static int SMALL_NUM_BOUND = 10;

    protected final static int MIDDLE_NUM_BOUND = 100;

    protected final static int BIG_NUM_BOUND = 1000;

    /** 链上的下一个处理者 */
    private Handler next;

    protected String name;

    public Handler(String name) {
        this.name = name;
    }

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    /**
     * 进入责任链，寻找能够处理请求的对象
     * @param request 具体的请求
     */
    final void enterChain(Request request) {
        if(canHandle(request)) {
            handle(request);
        } else if(next != null) {
            next.enterChain(request);
        } else {
            System.out.println("没有任何一个处理器可以处理这个请求，请求数据为[" + request.data + "]");
        }
    }

    /**
     * 判断是否可以处理请求
     * @param request 请求对象
     * @return true：可以处理
     */
    protected abstract boolean canHandle(Request request);

    /**
     * 处理具体请求的方法
     * @param request 请求对象
     */
    private void handle(Request request) {
        System.out.println("处理者["
                + name + "]处理了这个请求，请求数据为[" + request.data + "]");
    }
}
