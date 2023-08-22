package cn.ccy.asm;

import lombok.extern.log4j.Log4j2;
import org.objectweb.asm.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/21 0021 00:33:20
 * @description 类打印机
 */
@Log4j2
public class ClassPrinter2 extends ClassVisitor {
    public ClassPrinter2() {
        super(Opcodes.ASM5);
    }

    public ClassPrinter2(int api) {
        super(api);
    }

    public ClassPrinter2(int api, ClassVisitor cv) {
        super(api, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        log.info("Class Name: {}", name);
    }

    @Override
    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        log.info("Annotation: {}", desc);
        return null;
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        log.info("Field: {}/{}", name, desc);
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        log.info("Method: {}/{}", name, desc);
        return new MethodPrinter(Opcodes.ASM5, null);
    }

    @Override
    public void visitEnd() {
        log.info("Visit End.");
        super.visitEnd();
    }
}
