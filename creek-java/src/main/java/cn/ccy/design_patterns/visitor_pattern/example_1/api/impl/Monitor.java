package cn.ccy.design_patterns.visitor_pattern.example_1.api.impl;

import cn.ccy.design_patterns.visitor_pattern.example_1.api.ComputerPart;
import cn.ccy.design_patterns.visitor_pattern.example_1.api.ComputerPartVisitor;
import lombok.extern.log4j.Log4j2;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 18:37
 * @description 显示器
 */
@Log4j2
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        log.info("==> 显示器 check!");
        computerPartVisitor.visit(this);
    }
}
