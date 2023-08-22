package cn.ccy.asm;

import lombok.extern.log4j.Log4j2;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 10:11
 * @description 方法打印机
 */
@Log4j2
public class MethodPrinter extends MethodVisitor {
    public MethodPrinter(int api) {
        super(api);
    }

    public MethodPrinter(int api, MethodVisitor mv) {
        super(api, mv);
    }

    @Override
    public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {
        log.info("MethodPrinter visitLocalVariable =>{}/{}", name, desc);
        super.visitLocalVariable(name, desc, signature, start, end, index);
    }
}
