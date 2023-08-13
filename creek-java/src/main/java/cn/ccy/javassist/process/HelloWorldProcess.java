package cn.ccy.javassist.process;

import cn.ccy.javassist.origin.HelloWorld;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/7 0007 00:29:28
 * @description HelloWorld打印类字节码增强
 */
public class HelloWorldProcess {
    public static void main(String[] args) {
        // 以下方法不可以同时执行，会出现以下报错
        // Exception in thread "main" javassist.CannotCompileException: by java.lang.ClassFormatError: loader (instance of  sun/misc/Launcher$AppClassLoader): attempted  duplicate class definition for name: "cn/ccy/javassist/origin/HelloWorld"
//        入门();
        入门2_方法拷贝();
    }

    @SneakyThrows
    public static void 入门() {
        ClassPool cp = new ClassPool();
        cp.appendSystemPath();

        CtClass ctClass = cp.get("cn.ccy.javassist.origin.HelloWorld");
        CtMethod method = ctClass.getDeclaredMethods()[0];
        /*long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println("耗时统计：" + (end - start) + " ms");*/
        method.addLocalVariable("start", CtClass.longType);
//        以下写法不太行 [source error] no such field: start
//        method.insertBefore("long start = System.currentTimeMillis();");
        method.insertBefore(" start = System.currentTimeMillis();");
        method.insertAfter("long end = System.currentTimeMillis();\n" +
                "        System.out.println(\"耗时统计：\" + (end - start) + \" ms\");");
        ctClass.toClass();

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();
    }

    @SneakyThrows
    public static void 入门2_方法拷贝() {
        ClassPool cp = ClassPool.getDefault();
        cp.appendSystemPath();
        CtClass ctClass = cp.get("cn.ccy.javassist.origin.HelloWorld");
        CtMethod method = ctClass.getDeclaredMethods()[0];
        CtMethod copy = CtNewMethod.copy(method, ctClass, null);
        copy.setName(method.getName() + "$agent");
        ctClass.addMethod(copy);
        method.setBody(String.format("{long start = System.currentTimeMillis();\n" +
                "        try {\n" +
                "            String methodName = \"%s\";\n" +
                "            System.out.println(\"方法执行前...\");\n" +
                "            %s$agent($$);\n" +
                "            System.out.println(\"方法执行后...\");\n" +
                "        } finally {\n" +
                "            long end = System.currentTimeMillis();\n" +
                "            System.out.println(\"方法执行完成 共计耗时：\" + (end - start));\n" +
                "        }}", method.getName(), method.getName()));
        ctClass.toClass();
        Files.write(new File(System.getProperty("user.dir") + "/creek-java/target/HelloWorld.class").toPath(), ctClass.toBytecode());
        new HelloWorld().print();
    }
}
