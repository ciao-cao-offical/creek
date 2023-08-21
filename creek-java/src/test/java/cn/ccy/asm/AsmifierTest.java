package cn.ccy.asm;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.ASMifier;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 0022 00:55:51
 * @description Asmifier测试类
 */
public class AsmifierTest {
    @Test
    public void 测试Asmifier() throws IOException {
        ClassReader cr = new ClassReader("cn.ccy.asm.testobject.AsmTestObject");
        ASMifier as = new ASMifier();
        TraceClassVisitor tv = new TraceClassVisitor(null, as, new PrintWriter(System.out));
        cr.accept(tv, 0);
    }

    @Test
    public void 测试dump() throws Exception {
        byte[] dump = AsmTestObjectDump.dump();
        Files.write(new File(System.getProperty("user.dir") + "/target/dumpTest.class").toPath(), dump);
    }

}
