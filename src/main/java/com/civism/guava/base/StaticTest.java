package com.civism.guava.base;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：StaticTest
 * @date 2020/1/16 2:33 下午
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2020 蓝鲸淘.
 * @return
 */
public class StaticTest extends StaticParent {

    static {
        System.out.println("我是子类静态代码块");
    }
    {
        System.out.println("我是子类非静态代码块");
    }

    public StaticTest() {
        System.out.println("我是子类构造");
    }


    public static void main(String[] args) {
        StaticTest staticTest  = new StaticTest();

        List<Integer> list = new LinkedList<>();
        list.forEach(a ->{
            System.out.println(a);
        });

    }
}
