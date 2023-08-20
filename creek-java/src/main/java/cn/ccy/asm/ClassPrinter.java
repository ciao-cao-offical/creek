package cn.ccy.asm;

import org.objectweb.asm.ClassVisitor;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/21 0021 00:33:20
 * @description 类打印机
 */
public class ClassPrinter extends ClassVisitor {
    public ClassPrinter(int api) {
        super(api);
    }

    public ClassPrinter(int api, ClassVisitor cv) {
        super(api, cv);
    }
}
