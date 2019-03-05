package com.ushiro.demo.memento;

/**
 * 备忘录模式测试
 * @author Kripath
 * @date Created in 17:12 2019/3/5
 */
public class MementoTest {

    public static void main(String[] args) {
        // 创建备忘录管理器
        Caretaker caretaker = new Caretaker();

        // 创建可保存的对象
        Originator originator = new Originator();
        // 更新状态
        originator.update();
        // 保存当前状态，并交给备忘录管理器管理
        caretaker.add(originator.save());

        originator.update();
        caretaker.add(originator.save());

        // 恢复数据(读存档)
        // 恢复到最近的数据
        originator.restore(caretaker.getLast());
        // 恢复到指定位置的数据
        originator.restore(caretaker.getIndexOf(0));
    }
}
