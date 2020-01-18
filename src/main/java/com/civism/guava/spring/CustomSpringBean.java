package com.civism.guava.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：CustomSpringBean
 * @date 2019-11-25 14:49
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
@Component("guavaSessionFactory")
public class CustomSpringBean implements FactoryBean<GuavaSessionFactory>, InitializingBean {

    private GuavaSessionFactory guavaSessionFactory;

    @Override
    public GuavaSessionFactory getObject() throws Exception {
        if (this.guavaSessionFactory == null) {
            afterPropertiesSet();
        }
        return this.guavaSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return this.guavaSessionFactory == null ? GuavaSessionFactory.class : this.guavaSessionFactory.getClass();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.guavaSessionFactory = new GuavaSessionFactory();
    }

}
