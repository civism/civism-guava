package com.civism.guava.design;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：LazySingleton
 * @date 2019-11-22 14:52
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class LazySingleton {
    /**
     * 私有化构造函数
     */
    private LazySingleton() {
    }


    private static volatile LazySingleton lazySingleton = null;


    public static LazySingleton getInstance() {

        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
