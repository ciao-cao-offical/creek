package com.ciao.practice;

import org.junit.Test;

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
}
