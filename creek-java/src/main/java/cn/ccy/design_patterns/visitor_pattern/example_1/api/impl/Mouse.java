package cn.ccy.design_patterns.visitor_pattern.example_1.api.impl;

import cn.ccy.design_patterns.visitor_pattern.example_1.api.ComputerPart;
import cn.ccy.design_patterns.visitor_pattern.example_1.api.ComputerPartVisitor;
import lombok.extern.log4j.Log4j2;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 18:37
 * @description 鼠标
 */
@Log4j2
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        log.info("==> 鼠标 check!");
        computerPartVisitor.visit(this);
    }
}
