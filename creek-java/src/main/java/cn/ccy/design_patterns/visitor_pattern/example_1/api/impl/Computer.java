package cn.ccy.design_patterns.visiter_pattern.example_1.api.impl;

import cn.ccy.design_patterns.visiter_pattern.example_1.api.ComputerPart;
import cn.ccy.design_patterns.visiter_pattern.example_1.api.ComputerPartVisitor;
import lombok.extern.log4j.Log4j2;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 18:38
 * @description 电脑
 */
@Log4j2
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Keyboard(), new Mouse(), new Monitor()};
        log.info("电脑初始化完成...");
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}
