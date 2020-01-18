package com.civism.guava.design;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：ProxyRequest
 * @date 2019-11-25 13:35
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class ProxyRequest implements ProxySubject {


    private Request request = new Request();

    @Override
    public void process() {
        preRequest();
        request.process();
        afterRequest();
    }

    private void preRequest() {
        System.out.println("代理前执行。。。。。。");
    }

    private void afterRequest() {
        System.out.println("代理后执行。。。。。。");
    }
}
