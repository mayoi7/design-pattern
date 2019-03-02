package com.ushiro.demo.adapter;

/**
 * 对象适配器，通过对象调用适配方法，而不是调用父类方法
 * @author Kripath
 * @date Created in 11:04 2019/3/2
 */
public class SystemObjectAdapter implements Linux {

    private Windows windows;

    public SystemObjectAdapter(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void runLinux() {
        windows.runWindows();
    }
}
