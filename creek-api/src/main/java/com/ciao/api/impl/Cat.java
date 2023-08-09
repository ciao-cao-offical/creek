package com.ciao.api.impl;

import com.ciao.api.Animal;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/9 19:58
 * @description 猫
 */
public class Cat implements Animal {
    @Override
    public String sing() {
        return "miao miao!";
    }
}
