package cn.ccy.asm;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;

import java.io.IOException;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 10:14
 * @description 方法打印机测试
 */
public class MethodPrinterTest {
    @Test
    public void 测试局部变量打印() throws IOException {
        ClassReader cr = new ClassReader("cn.ccy.asm.testobject.AsmTestObject");
        ClassPrinter2 cp2 = new ClassPrinter2(Opcodes.ASM5);
        cr.accept(cp2, 0);
    }
}
