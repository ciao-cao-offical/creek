package com.ciao.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2021/11/30
 * @description ArrayList测试类
 */
public class ArrayListTest {
    @Test
    public void 测试元素数量(){
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.add("1");
        System.out.println(list.get(1));
    }
}
