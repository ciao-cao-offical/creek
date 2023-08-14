package cn.ccy.design_patterns.visiter_pattern.example_1.api;

import cn.ccy.design_patterns.visiter_pattern.example_1.api.impl.Computer;
import cn.ccy.design_patterns.visiter_pattern.example_1.api.impl.Keyboard;
import cn.ccy.design_patterns.visiter_pattern.example_1.api.impl.Monitor;
import cn.ccy.design_patterns.visiter_pattern.example_1.api.impl.Mouse;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 18:33
 * @description 访问者接口
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
