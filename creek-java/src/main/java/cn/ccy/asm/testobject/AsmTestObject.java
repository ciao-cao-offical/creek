package cn.ccy.asm.testobject;

import lombok.extern.log4j.Log4j2;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/21 0021 00:27:26
 * @description ASM测试对象
 */
@Log4j2
public class AsmTestObject {
    private final String name = "Asm Test Object";

    public String getName() {
        log.info("getName ==> {}", name);
        return name;
    }

    public void sayMyName() {
        log.info("sayMyName ==> {}", name);
    }

    public void giveMeYourName(String yourName) {
        log.info("giveMeYourName ==> Your name is {} and my name is {}", yourName, name);
    }
}
