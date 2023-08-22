package com.ciao.practice;

import cn.ccy.asm.testobject.AsmTestObject;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.objectweb.asm.Type;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 10:27
 * @description ASM Type测试类
 */
@Log4j2
public class AsmTypeTest {
    @Test
    public void 测试() {
        log.info(Type.getDescriptor(Integer.class));
        log.info(Type.getDescriptor(Integer[].class));
        log.info(Type.getDescriptor(Integer[][].class));
        log.info(Type.getDescriptor(int.class));
        log.info(Type.getDescriptor(void.class));
        log.info(Type.getDescriptor(Boolean.class));
        log.info(Type.getDescriptor(boolean.class));
        log.info(Type.getDescriptor(boolean[].class));
        log.info(Type.getDescriptor(boolean[][].class));
        log.info(Type.getDescriptor(AsmTestObject.class));
        log.info(Type.getDescriptor(AsmTestObject[].class));
        log.info(Type.getDescriptor(AsmTestObject[][].class));
    }
}
