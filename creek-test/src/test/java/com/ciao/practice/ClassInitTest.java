package com.ciao.practice;

import com.ciao.practice.parent.Parent;
import org.junit.Test;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/8
 * @description 类初始化测试
 */
public class ClassInitTest {
    @Test
    public void 测试子类初始化() {
        Children children = new Children();
        children.setFastName("布鲁斯");
        children.setLastName("韦恩");
        Integer countryCode = children.getCountryCode();
        System.out.println(children instanceof Children);
        System.out.println(children instanceof Parent);

        Children children_1 = new Children();
        children_1.setFastName("克拉克");
        children_1.setLastName("肯特");
        Integer countryCode_1 = children_1.getCountryCode();
        System.out.println(children_1 instanceof Children);
        System.out.println(children_1 instanceof Parent);

    }

    @Test
    public void 类初始化测试() {
        Clazz clazz = new Clazz() {
            {
                this.setPro("测试");
            }

            @Override
            public Clazz setPro(String pro) {
                System.out.println("new setPro");
                return super.setPro(pro);
            }

            @Override
            public String getPro() {
                System.out.println("new getPro");
                return super.getPro();
            }
        };

        Clazz clazz1 = new Clazz();
        /*clazz1.setPro("测试1");*/

        System.out.println(clazz instanceof Clazz);
        System.out.println(clazz.getPro());
        System.out.println(clazz1.getPro());
    }

}
