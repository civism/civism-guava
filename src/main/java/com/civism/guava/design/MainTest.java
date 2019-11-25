package com.civism.guava.design;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：MainTest
 * @date 2019-11-22 15:09
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Prototype prototype = new Prototype("Hello World");
        Prototype clone = (Prototype) prototype.clone();
        System.out.println(prototype == clone);
        System.out.println(clone.getMessage());
    }


}
