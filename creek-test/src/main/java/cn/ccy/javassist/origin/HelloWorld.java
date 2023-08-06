package cn.ccy.javassist.origin;

import lombok.SneakyThrows;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/7 0007 00:27:24
 * @description HelloWorld打印
 */
public class HelloWorld {
    @SneakyThrows
    public void print() {
        System.out.println("print start...");
        Thread.sleep(1000);
        System.out.println("Hello World! ヾ(◍°∇°◍)ﾉﾞ");
        System.out.println("print end after 1s...");
    }
}
