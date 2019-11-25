package com.civism.guava.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：Main
 * @date 2019-11-20 16:06
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
        Iterator<HelloService> iterator = load.iterator();
        while (iterator.hasNext()){
            HelloService next = iterator.next();
            next.sayHello();
        }

    }
}
