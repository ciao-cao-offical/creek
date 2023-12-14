package com.ciao.practice;

import cn.hutool.core.text.StrSplitter;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/15 0015 00:49:45
 * @description hutool-StrSplitter测试
 */
@Log4j2
public class StrSplitterTest {
    @Test
    public void 测试() {
        String str = "曹成印-1991-05-09";
        List<String> split = StrSplitter.split(str, "-", true, true);
        log.info(split);
    }
}
