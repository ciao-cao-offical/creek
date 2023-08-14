package cn.ccy.design_patterns.visitor_pattern.example_1.api.impl;

import cn.ccy.design_patterns.visitor_pattern.example_1.api.ComputerPartVisitor;
import lombok.extern.log4j.Log4j2;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 18:42
 * @description 实体访问者_2
 */
@Log4j2
public class ComputerPartDisplayVisitor_2 implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        log.info("visitor_2：访问电脑！");
    }

    @Override
    public void visit(Mouse mouse) {
        log.info("visitor_2：访问鼠标！");
    }

    @Override
    public void visit(Keyboard keyboard) {
        log.info("visitor_2：访问键盘！");
    }

    @Override
    public void visit(Monitor monitor) {
        log.info("visitor_2：访问显示器！");
    }
}
