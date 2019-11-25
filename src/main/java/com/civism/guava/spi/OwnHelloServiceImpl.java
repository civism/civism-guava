package com.civism.guava.spi;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：OwnHellService
 * @date 2019-11-20 16:04
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class OwnHelloServiceImpl implements HelloService {

    public void sayHello() {
        System.out.println("我自己说 hello word");
    }
}
