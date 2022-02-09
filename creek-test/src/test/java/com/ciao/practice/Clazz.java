package com.ciao.practice;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/9
 * @description 当前类の简要描述
 */
public class Clazz {
    private String pro;

    {
        this.setPro("测试==>");
    }

    public String getPro() {
        System.out.println("getPro");
        return pro;
    }

    public Clazz setPro(String pro) {
        System.out.println("setPro");
        this.pro = pro;
        return this;
    }
}
