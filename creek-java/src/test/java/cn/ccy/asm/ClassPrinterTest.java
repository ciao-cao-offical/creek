package cn.ccy.asm;

import org.junit.Test;
import org.objectweb.asm.ClassReader;

import java.io.IOException;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/21 20:34
 * @description ClassPrinter测试类
 */
public class ClassPrinterTest {

    @Test
    public void 测试类打印() throws IOException {
        ClassReader cr = new ClassReader("cn.ccy.asm.testobject.AsmTestObject");
        cr.accept(new ClassPrinter(),0);
    }
}