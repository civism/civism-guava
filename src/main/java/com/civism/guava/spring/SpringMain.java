package com.civism.guava.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：SpringMain
 * @date 2019-11-21 13:50
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class SpringMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/*.xml");

//        GuavaSessionFactory bean = context.getBean(GuavaSessionFactory.class);
        GuavaSessionFactory bean = (GuavaSessionFactory)context.getBean("guavaSessionFactory");
//        bean.getObject().say();
        System.out.println(bean);
        bean.say();

    }
}
