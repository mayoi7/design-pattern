package com.ushiro.demo.adapter;

import com.ushiro.demo.adapter.Linux;
import com.ushiro.demo.adapter.Win10;

/**
 * 适配器模式中的类适配器，通过继承实现<br/>
 * 给windows系统添加一个linux的接口，即可使其在linux系统上运行
 * @author Kripath
 * @date Created in 10:55 2019/3/2
 */
public class SystemClassAdapter extends Win10 implements Linux {

    @Override
    public void runLinux() {
        runWindows();
    }
}
