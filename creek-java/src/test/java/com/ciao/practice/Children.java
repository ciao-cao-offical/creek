package com.ciao.practice;


import com.ciao.practice.parent.Parent;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/8
 * @description 子类
 */
public class Children extends Parent {
    private String fastName;

    public Children() {
        super();
        System.out.println("Children init!");
    }

    public String getFastName() {
        return fastName;
    }

    public Children setFastName(String fastName) {
        this.fastName = fastName;
        return this;
    }
}
