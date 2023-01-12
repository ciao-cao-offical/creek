package com.ciao.practice.parent;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/8
 * @description 父类
 */
public class Parent {
    private static final Integer countryCode = 10;
    private String lastName;

    public Parent() {
        System.out.println("Parent init!");
    }

    public String getLastName() {
        return lastName;
    }

    public Parent setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getCountryCode() {
        return countryCode;
    }
}
