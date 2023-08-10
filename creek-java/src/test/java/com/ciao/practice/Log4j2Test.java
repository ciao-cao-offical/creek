package com.ciao.practice;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/11 0011 00:49:09
 * @description Log4j2测试类
 */
@Log4j2
public class Log4j2Test {
    private static final Logger LOG = LogManager.getLogger(Log4j2Test.class);

    @Test
    public void 测试日志打印() {
        LOG.trace("log4j2 trace -> 测试日志打印");
        LOG.debug("log4j2 debug -> 测试日志打印");
        LOG.info("log4j2 info -> 测试日志打印");
        LOG.warn("log4j2 warn -> 测试日志打印");
        LOG.error("log4j2 error -> 测试日志打印");
    }

    @Test
    public void 测试日志打印_2() {
        log.trace("lombok log4j2 trace -> 测试日志打印");
        log.debug("lombok log4j2 debug -> 测试日志打印");
        log.info("lombok log4j2 info -> 测试日志打印");
        log.warn("lombok log4j2 warn -> 测试日志打印");
        log.error("lombok log4j2 error -> 测试日志打印");
    }
}
