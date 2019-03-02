package com.ushiro.demo.prototype;

/**
 * 客户端的测试
 * @author Kripath
 * @date Created in 10:08 2019/3/2
 */
public class ClientTest {

    public static void main(String[] args) {
        // 创建供拷贝的原型
        Homework prototype = new Homework("aaa", "aaa-content");

        // 进行原型拷贝
        Homework copyed = prototype.clone();
        // 修改其他属性
        copyed.setName("bbb");

        System.out.print("Prototype: ");
        prototype.show();

        System.out.print("Copyed: ");
        copyed.show();

        System.out.println("Is prototype and copyed the same object: " + (prototype == copyed));
        System.out.println("Do prototype and copyed have the same class: "
                + (prototype.getClass() == copyed.getClass()));
    }
}
