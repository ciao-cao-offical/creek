package com.ciao.practice;

import org.junit.Test;

import java.io.IOException;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/10 0010 23:51:29
 * @description Runtime类测试
 * https://docs.oracle.com/javase/8/docs/api/
 */
public class RuntimeTest {
    @Test
    public void 测试数组使用内存量_字节() {
        Runtime runtime = Runtime.getRuntime();
        long m1 = runtime.freeMemory();
        System.out.println("m1 = " + m1 + " Byte");
        String[] strings = new String[100000];
        long m2 = runtime.freeMemory();
        System.out.println("m2 = " + m2 + " Byte");
        System.out.println("init strings costs " + (m1 - m2) + " Byte");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "new String => " + i * 10000;
        }
        long m3 = runtime.freeMemory();
        System.out.println("m3 = " + m3 + " Byte");
        System.out.println("full strings costs " + (m2 - m3) + " Byte");
    }

    @Test
    public void 测试启动windows笔记本() {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process notepad = runtime.exec("notepad");
            int waitFor = notepad.waitFor();
            System.out.println("waitFor -> " + waitFor);
            System.out.println("notepad exit value -> " + notepad.exitValue());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }

}
