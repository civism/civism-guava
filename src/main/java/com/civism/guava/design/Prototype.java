package com.civism.guava.design;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：Realizetype
 * @date 2019-11-22 15:08
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class Prototype implements Cloneable {

    private String message;

    public Prototype(String message) {
        this.message = message;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println(message);
        return super.clone();
    }

    public String getMessage() {
        return message;
    }
}
