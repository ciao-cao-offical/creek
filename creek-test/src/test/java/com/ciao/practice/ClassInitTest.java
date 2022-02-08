package com.ciao.practice;

import org.junit.Test;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/8
 * @description 类初始化测试
 */
public class ClassInitTest {
    @Test
    public void 测试子类初始化() {
        Children children = new Children();
        children.setFastName("布鲁斯");
        children.setLastName("韦恩");
        System.out.println(children instanceof Children);
        System.out.println(children instanceof Parent);

    }
}
