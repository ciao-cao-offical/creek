package com.caochengyin.model.pojo;

import lombok.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2018/12/27
 * @description 人类
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 描述
     */
    private String desc;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
