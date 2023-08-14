package cn.ccy.design_patterns.visitor_pattern.example_1;

import cn.ccy.design_patterns.visitor_pattern.example_1.api.impl.Computer;
import cn.ccy.design_patterns.visitor_pattern.example_1.api.impl.ComputerPartDisplayVisitor_1;
import cn.ccy.design_patterns.visitor_pattern.example_1.api.impl.ComputerPartDisplayVisitor_2;
import lombok.extern.log4j.Log4j2;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 18:48
 * @description 访问者模式Demo
 */
@Log4j2
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        log.info("=======================================");
        computer.accept(new ComputerPartDisplayVisitor_1());
        log.info("=======================================");
        computer.accept(new ComputerPartDisplayVisitor_2());
    }
}
