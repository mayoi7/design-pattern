package com.ushiro.demo.command;

/**
 * 具体命令类，每一条具体的命令对应一个命令类<br/>
 * 做肉的命令
 * @author Kripath
 * @date Created in 11:24 2019/3/6
 */
public class MeatOrderCommand implements OrderCommand {

    private MeatCooker meatCooker;

    final static String ORDER_NAME = "肉";

    public MeatOrderCommand(MeatCooker meatCooker) {
        this.meatCooker = meatCooker;
    }

    @Override
    public void execute() {
        meatCooker.cook();
    }
}
