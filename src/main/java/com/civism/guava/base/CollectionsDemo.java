package com.civism.guava.base;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Guava
 * @version 1.0
 * @projectName：civism-guava
 * @className：CollectionsDemo
 * @date 2020/1/15 2:09 下午
 * @E-mail:gongdexing@oxyzgroup.com
 * @Copyright: 版权所有 (C) 2020 蓝鲸淘.
 * @return
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(200);
        list.add(500);
        list.add(400);
        list.add(2);

        Collections.sort(list);

        System.out.println(JSON.toJSONString(list));

        int i = Collections.binarySearch(list, 2);

        System.out.println(i);

        Collections.swap(list,1,2);
        System.out.println(JSON.toJSONString(list));

        Collections.reverse(list);
        System.out.println(JSON.toJSONString(list));

        Collections.shuffle(list);

        System.out.println(JSON.toJSONString(list));

//        Collections.fill(list,1111);
//        System.out.println(JSON.toJSONString(list));

//        List<Integer> s2 = new ArrayList<>(list.size());
//        Collections.copy(s2,list);
//        System.out.println(JSON.toJSONString(s2));

        Integer min = Collections.min(list);
        System.out.println(min);

        System.out.println(JSON.toJSONString(list));

        Collections.rotate(list,2);
        System.out.println(JSON.toJSONString(list));


        int frequency = Collections.frequency(list, 1);
        System.out.println(frequency);

        List<Integer> integers = Collections.singletonList(2);
//        integers.add(2);

        System.out.println(JSON.toJSONString(integers));

    }
}
