package com.civism.guava.spi;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：TheyHelloServiceImpl
 * @date 2019-11-20 16:06
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class TheyHelloServiceImpl implements HelloService {

    public void sayHello() {
        System.out.println("他们说 hello word");
    }
}
