package com.civism.guava.demo;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：TimeUtils
 * @date 2019-11-26 15:33
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2019 蓝鲸淘.
 * @return
 */
public class TimeUtils {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.instant());
        System.out.println(clock.millis());
        System.out.println(Instant.now());
        System.out.println(Instant.MIN);

        LocalDate localDate = LocalDate.parse("2019-01-10");
        String format = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(format);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));


    }
}
