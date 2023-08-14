package cn.ccy.design_patterns.visitor_pattern.example_1.api;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/14 18:34
 * @description 元素接口
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
