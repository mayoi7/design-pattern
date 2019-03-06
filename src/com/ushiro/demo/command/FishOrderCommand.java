package com.ushiro.demo.command;

/**
 * 具体命令类，每一条具体的命令对应一个命令类<br/>
 * 做鱼的命令
 * @author Kripath
 * @date Created in 11:24 2019/3/6
 */
public class FishOrderCommand implements OrderCommand {

    private FishCooker fishCooker;

    final static String ORDER_NAME = "鱼";

    public FishOrderCommand(FishCooker fishCooker) {
        this.fishCooker = fishCooker;
    }

    @Override
    public void execute() {
        fishCooker.cook();
    }
}
