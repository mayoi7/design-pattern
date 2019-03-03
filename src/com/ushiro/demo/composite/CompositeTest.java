package com.ushiro.demo.composite;

/**
 * 组合模式的测试样例
 * @author Kripath
 * @date Created in 8:44 2019/3/3
 */
public class CompositeTest {

    public static void main(String[] args) {
        // 第一个编号是节点所在层数，第二个编号是节点在该层的序号
        AbstractNode root = new Node("root-1-1");
        AbstractNode n1 = new Node("node-2-1");
        AbstractNode n2 = new Node("node-2-2");

        root.add(n1);
        root.add(n2);

        n1.add(new Leaf("leaf-3-1"));
        n1.add(new Leaf("leaf-3-2"));
        n2.add(new Leaf("leaf-3-3"));

        root.operate();
    }
}
