package com.ushiro.demo.command;

/**
 * 执行命令的具体类
 * @author Kripath
 * @date Created in 11:29 2019/3/6
 */
public class FishCooker extends Cooker {

    @Override
    void cook() {
        System.out.println("做了一条清蒸鱼");
    }
}
