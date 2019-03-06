package com.ushiro.demo.command;

/**
 * 命令模式
 * @author Kripath
 * @date Created in 11:21 2019/3/6
 */
public class CommandTest {

    public static void main(String[] args) {
        // 创建一个服务员
        WaiterInvoker waiter = new WaiterInvoker();

        // 点单
        waiter.order("鱼");
        waiter.order("肉");
        waiter.order("汤");
        waiter.order("肉");
        waiter.order("鱼");

        // 服务员拿给厨师做
        waiter.executeOrders();
    }
}
