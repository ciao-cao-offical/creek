package com.ciao.api.impl;

import com.ciao.api.Animal;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/9 20:08
 * @description 老鼠
 */
public class Mouse implements Animal {
    @Override
    public String sing() {
        return "zhi zhi!";
    }
}
