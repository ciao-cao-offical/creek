package com.ciao.practice;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/4 16:50
 * @description effectively final测试类 <br/>
 * 编译指令：javac -encoding utf-8 EffectivelyFinalTest.java <br/>
 * 编译结果：<br/>：<img src="../../../../../main/resources/pics/effectively_final_complied.png"/>
 */
public class EffectivelyFinalTest {
    /**
     * 无参构造函数
     */
    public EffectivelyFinalTest() {
        System.out.print("EffectivelyFinalTest init success!");
    }

    /**
     * 内部类
     */
    public class InnerClass {
        public InnerClass() {
            System.out.print("InnerClass init success!");
        }
    }

    /**
     * 匿名内部类_0
     */
    InnerClass ic_0 = new InnerClass() {
    };

    /**
     * 匿名内部类_1
     * 该匿名内部类不会生成字节码文件（因为他没有任何方法 ————joyCoder 待确认）
     */
    InnerClass ic_1 = new InnerClass();
}
