package com.ushiro.demo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者，负责调用各种命令
 * @author Kripath
 * @date Created in 11:35 2019/3/6
 */
public class WaiterInvoker {

    private List<OrderCommand> commands = new ArrayList<>();

    private FishCooker fishCooker = new FishCooker();

    private MeatCooker meatCooker = new MeatCooker();

    /**
     * 点单
     * @param name 菜名
     */
    void order(String name) {
        if(FishOrderCommand.ORDER_NAME.equals(name)) {
            commands.add(new FishOrderCommand(fishCooker));
        } else if(MeatOrderCommand.ORDER_NAME.equals(name)) {
            commands.add(new MeatOrderCommand(meatCooker));
        } else {
            System.out.println("没有[" + name + "]这道菜");
        }
    }

    /**
     * 执行所有的点单
     */
    void executeOrders() {
        for (OrderCommand command :commands) {
            command.execute();
        }
        // 执行完之后清空命令菜单
        commands.clear();
    }
}
