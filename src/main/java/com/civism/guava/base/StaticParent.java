package com.civism.guava.base;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：StaticParent
 * @date 2020/1/16 2:31 下午
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2020 蓝鲸淘.
 * @return
 */
public class StaticParent {

    static {
        System.out.println("我是父类静态代码库");
    }

    {
        System.out.println("我是父类非静态代码块");
    }

    public StaticParent() {
        System.out.println("我是父类构造");
    }
}
