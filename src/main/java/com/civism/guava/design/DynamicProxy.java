package com.civism.guava.design;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：DynamicProxy
 * @date 2019-11-25 13:43
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class DynamicProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----动态代理-----");
        return method.invoke(proxy, args);
    }


    public static void main(String[] args) {

        ProxyRequest proxyRequest = new ProxyRequest();

        ProxySubject o = (ProxySubject) Proxy.newProxyInstance(proxyRequest.getClass().getClassLoader(), proxyRequest.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("-----动态代理-----");
                return method.invoke(proxy, args);
            }
        });
        o.process();
    }
}
