package cn.ccy.javassist.process;

import cn.ccy.javassist.origin.HelloWorld;
import javassist.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/7 0007 00:29:28
 * @description HelloWorld打印类字节码增强
 */
public class HelloWorldProcess {
    public static void main(String[] args) throws NotFoundException, CannotCompileException {
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
}
