package cn.ccy.asm;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/23 0023 00:22:05
 * @description TraceVisitor测试类
 */
public class TraceVisitorTest {
    @Test
    public void 测试操作数栈和局部变量表() throws IOException {
        ClassReader cr = new ClassReader("cn.ccy.asm.testobject.AsmTestObject2");
        TraceClassVisitor tv = new TraceClassVisitor(null, new PrintWriter(System.out));
        cr.accept(tv, 0);
    }
}
