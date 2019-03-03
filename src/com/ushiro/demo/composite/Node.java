package com.ushiro.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 * @author Kripath
 * @date Created in 8:39 2019/3/3
 */
public class Node extends AbstractNode {

    private List<AbstractNode> son = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractNode node) {
        son.add(node);
    }

    @Override
    public void operate() {
        System.out.println("[" + name + "] 扫描子组件");

        for (AbstractNode node :son) {
            node.operate();
        }
    }
}
