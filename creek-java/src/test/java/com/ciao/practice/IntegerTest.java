package com.ciao.practice;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/16 10:02
 * @description Integer测试
 */
@Log4j2
public class IntegerTest {
    @Test
    public void t1(){
        Integer x = Integer.valueOf("1");
        Integer x_1 = Integer.parseInt("1");
    }
}
