package com.civism.guava.design;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：HungrySingleton
 * @date 2019-11-22 15:03
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class HungrySingleton {

    private HungrySingleton() {
    }

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
