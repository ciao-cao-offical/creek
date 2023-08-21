package cn.ccy.asm;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 0022 00:39:24
 * @description 类名修改器测试类
 */
public class ClassRenamerTest {
    @Test
    public void 测试修改类名() throws IOException {
        ClassReader cr = new ClassReader("cn.ccy.asm.testobject.AsmTestObject");
        ClassWriter cw = new ClassWriter(cr, 0);
        ClassRenamer classRenamer = new ClassRenamer(Opcodes.ASM5, cw);
        cr.accept(classRenamer, 0);
        byte[] byteArray = cw.toByteArray();
        Files.write(new File(System.getProperty("user.dir") + "/target/RenameTest.class").toPath(), byteArray);
    }
}