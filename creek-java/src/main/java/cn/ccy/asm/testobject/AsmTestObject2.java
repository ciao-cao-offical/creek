package cn.ccy.asm.testobject;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/23 0023 00:20:09
 * @description ASM测试对象2
 */
public class AsmTestObject2 {
    public static void main(String[] args) {
        int i = 5;
        i = ++i;
//        i = i++;
        System.out.println(i);
    }
}
