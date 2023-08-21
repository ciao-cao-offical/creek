package cn.ccy.asm;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 0022 01:05:24
 * @description Asmifier dump类
 * "D:\Program Files\JDK\jdk1.8.0_181\bin\java.exe" -Dvisualvm.id=12066494134600 -Dvisualgc.id=12066494115600 -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:D:\Program Files\JetBrains\IntelliJ IDEA 2021.2.1\lib\idea_rt.jar=12104:D:\Program Files\JetBrains\IntelliJ IDEA 2021.2.1\bin" -Dfile.encoding=UTF-8 -classpath "D:\Program Files\JetBrains\IntelliJ IDEA 2021.2.1\lib\idea_rt.jar;D:\Program Files\JetBrains\IntelliJ IDEA 2021.2.1\plugins\junit\lib\junit5-rt.jar;D:\Program Files\JetBrains\IntelliJ IDEA 2021.2.1\plugins\junit\lib\junit-rt.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\charsets.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\deploy.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\access-bridge-64.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\cldrdata.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\dnsns.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\jaccess.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\jfxrt.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\localedata.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\nashorn.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\sunec.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\sunjce_provider.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\sunmscapi.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\sunpkcs11.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\ext\zipfs.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\javaws.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\jce.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\jfr.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\jfxswt.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\jsse.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\management-agent.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\plugin.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\resources.jar;D:\Program Files\JDK\jdk1.8.0_181\jre\lib\rt.jar;D:\CodeZone\JD\creek\creek-java\target\test-classes;D:\CodeZone\JD\creek\creek-java\target\classes;D:\CodeZone\Java\repository\junit\junit\4.13.2\junit-4.13.2.jar;D:\CodeZone\Java\repository\org\hamcrest\hamcrest-core\2.2\hamcrest-core-2.2.jar;D:\CodeZone\Java\repository\org\hamcrest\hamcrest\2.2\hamcrest-2.2.jar;D:\CodeZone\Java\repository\com\lmax\disruptor\3.4.4\disruptor-3.4.4.jar;D:\CodeZone\Java\repository\org\openjdk\jol\jol-core\0.9\jol-core-0.9.jar;D:\CodeZone\Java\repository\com\google\guava\guava\32.1.1-jre\guava-32.1.1-jre.jar;D:\CodeZone\Java\repository\com\google\guava\failureaccess\1.0.1\failureaccess-1.0.1.jar;D:\CodeZone\Java\repository\com\google\guava\listenablefuture\9999.0-empty-to-avoid-conflict-with-guava\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;D:\CodeZone\Java\repository\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar;D:\CodeZone\Java\repository\org\checkerframework\checker-qual\3.33.0\checker-qual-3.33.0.jar;D:\CodeZone\Java\repository\com\google\errorprone\error_prone_annotations\2.18.0\error_prone_annotations-2.18.0.jar;D:\CodeZone\Java\repository\com\google\j2objc\j2objc-annotations\2.8\j2objc-annotations-2.8.jar;D:\CodeZone\Java\repository\org\javassist\javassist\3.29.2-GA\javassist-3.29.2-GA.jar;D:\CodeZone\Java\repository\org\projectlombok\lombok\1.18.28\lombok-1.18.28.jar;D:\CodeZone\JD\creek\creek-java-api\target\classes;D:\CodeZone\Java\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;D:\CodeZone\Java\repository\org\apache\logging\log4j\log4j-core\2.20.0\log4j-core-2.20.0.jar;D:\CodeZone\Java\repository\org\ow2\asm\asm-debug-all\5.2\asm-debug-all-5.2.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 cn.ccy.asm.AsmifierTest,测试Asmifier
 */

import org.objectweb.asm.*;

public class AsmTestObjectDump implements Opcodes {

    public static byte[] dump() throws Exception {

        ClassWriter cw = new ClassWriter(0);
        FieldVisitor fv;
        MethodVisitor mv;
        AnnotationVisitor av0;

        cw.visit(52, ACC_PUBLIC + ACC_SUPER, "cn/ccy/asm/testobject/AsmTestObject", null, "java/lang/Object", null);

        cw.visitSource("AsmTestObject.java", null);

        {
            av0 = cw.visitAnnotation("Lcn/ccy/annotation/TestObject;", false);
            av0.visitEnd();
        }
        {
            fv = cw.visitField(ACC_PRIVATE + ACC_FINAL + ACC_STATIC, "log", "Lorg/apache/logging/log4j/Logger;", null, null);
            fv.visitEnd();
        }
        {
            fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "name", "Ljava/lang/String;", null, "Asm Test Object");
            fv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(14, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(15, l1);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitLdcInsn("Asm Test Object");
            mv.visitFieldInsn(PUTFIELD, "cn/ccy/asm/testobject/AsmTestObject", "name", "Ljava/lang/String;");
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcn/ccy/asm/testobject/AsmTestObject;", null, l0, l2, 0);
            mv.visitMaxs(2, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(18, l0);
            mv.visitFieldInsn(GETSTATIC, "cn/ccy/asm/testobject/AsmTestObject", "log", "Lorg/apache/logging/log4j/Logger;");
            mv.visitLdcInsn("getName ==> {}");
            mv.visitLdcInsn("Asm Test Object");
            mv.visitMethodInsn(INVOKEINTERFACE, "org/apache/logging/log4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(19, l1);
            mv.visitLdcInsn("Asm Test Object");
            mv.visitInsn(ARETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcn/ccy/asm/testobject/AsmTestObject;", null, l0, l2, 0);
            mv.visitMaxs(3, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "sayMyName", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(23, l0);
            mv.visitFieldInsn(GETSTATIC, "cn/ccy/asm/testobject/AsmTestObject", "log", "Lorg/apache/logging/log4j/Logger;");
            mv.visitLdcInsn("sayMyName ==> {}");
            mv.visitLdcInsn("Asm Test Object");
            mv.visitMethodInsn(INVOKEINTERFACE, "org/apache/logging/log4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(24, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcn/ccy/asm/testobject/AsmTestObject;", null, l0, l2, 0);
            mv.visitMaxs(3, 1);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_PUBLIC, "giveMeYourName", "(Ljava/lang/String;)V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(27, l0);
            mv.visitFieldInsn(GETSTATIC, "cn/ccy/asm/testobject/AsmTestObject", "log", "Lorg/apache/logging/log4j/Logger;");
            mv.visitLdcInsn("giveMeYourName ==> Your name is {} and my name is {}");
            mv.visitVarInsn(ALOAD, 1);
            mv.visitLdcInsn("Asm Test Object");
            mv.visitMethodInsn(INVOKEINTERFACE, "org/apache/logging/log4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(28, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "Lcn/ccy/asm/testobject/AsmTestObject;", null, l0, l2, 0);
            mv.visitLocalVariable("yourName", "Ljava/lang/String;", null, l0, l2, 1);
            mv.visitMaxs(4, 2);
            mv.visitEnd();
        }
        {
            mv = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(12, l0);
            mv.visitLdcInsn(Type.getType("Lcn/ccy/asm/testobject/AsmTestObject;"));
            mv.visitMethodInsn(INVOKESTATIC, "org/apache/logging/log4j/LogManager", "getLogger", "(Ljava/lang/Class;)Lorg/apache/logging/log4j/Logger;", false);
            mv.visitFieldInsn(PUTSTATIC, "cn/ccy/asm/testobject/AsmTestObject", "log", "Lorg/apache/logging/log4j/Logger;");
            mv.visitInsn(RETURN);
            mv.visitMaxs(1, 0);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
