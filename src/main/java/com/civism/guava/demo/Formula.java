package com.civism.guava.demo;

import org.springframework.core.convert.converter.Converter;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：Formula
 * @date 2019-11-26 13:43
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    default double sqrt(double b) {
        return Math.sqrt(b);
    }
}


class TestA {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };
        System.out.println(formula.calculate(9));

        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);


        String str = "Hello world";
        Supplier<String> sup = () -> str.toUpperCase();
        System.out.println(sup.get());


        Consumer con = (x) -> System.out.println(x);
        con.accept(100);


        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);
        b.accept(1,"2");


    }
}
