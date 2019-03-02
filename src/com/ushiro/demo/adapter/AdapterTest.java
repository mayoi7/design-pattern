package com.ushiro.demo.adapter;

/**
 * 适配器测试
 * @author Kripath
 * @date Created in 11:00 2019/3/2
 */
public class AdapterTest {

    /**
     * 类适配器测试
     */
    private static void classAdapterTest() {
        Linux linux = new SystemClassAdapter();
        linux.runLinux();
    }

    /**
     * 对象适配器测试
     */
    private static void objectAdapterTest() {
        Linux linux = new SystemObjectAdapter(new Win10());
        linux.runLinux();
    }

    public static void main(String[] args) {
//        classAdapterTest();
        objectAdapterTest();
    }
}
