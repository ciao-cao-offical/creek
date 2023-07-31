package com.ciao.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/20
 * @description String测试
 */
public class StringTest {
    @Test
    public void 测试字符串是否包含换行符() {
        String s = "该字符串包含换行符\n测试";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("【%d】==>【%c】", i, chars[i]);
        }
    }

    @Test
    public void 测试startsWith方法() {
        String test_str = "001";
        System.out.println(test_str.startsWith("01", 1));
        System.out.println(test_str.startsWith("01", 2));
        System.out.println(test_str.startsWith("01", 3));
    }

    @Test
    public void 测试ArrayList的add方法() {
        Integer[] alphas = {100001, 100002, 100003, 100001};
        int i = 0;
        Integer s = 0;
        List<Integer> list = new ArrayList<>();
        while (i < alphas.length) {
            s = alphas[i];
            list.add(s);

            i++;
        }

        System.out.println(list);

    }
}
