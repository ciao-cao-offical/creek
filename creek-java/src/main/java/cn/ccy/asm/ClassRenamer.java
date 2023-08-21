package cn.ccy.asm;

import lombok.extern.log4j.Log4j2;
import org.objectweb.asm.ClassVisitor;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 0022 00:34:24
 * @description 类名修改器
 */
@Log4j2
public class ClassRenamer extends ClassVisitor {

    public ClassRenamer(int api) {
        super(api);
    }

    public ClassRenamer(int api, ClassVisitor cv) {
        super(api, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        String newName = String.format("%s$Agent", name);
        log.info("ClassRenamer#visit ==> {}", newName);
        super.visit(version, access, newName, signature, superName, interfaces);
    }
}
