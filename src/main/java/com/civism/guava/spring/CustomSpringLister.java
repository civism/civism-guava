package com.civism.guava.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：CustomSpringLister
 * @date 2019-11-22 13:38
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
@Component
public class CustomSpringLister implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        System.out.println(applicationEvent.getSource());

        System.out.println("=======");
    }
}
