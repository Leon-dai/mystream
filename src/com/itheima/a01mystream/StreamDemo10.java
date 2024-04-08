package com.itheima.a01mystream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        /*
            collect(Collector collector)    收集流中的数据，放到集合中（List  Set Map)
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-34", "王二麻子-男-37", "谢广坤-男-41");

        //收集List集合当中
        //需求：
        //把所有的男性收集起来
        List<String> result1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(result1);

        //收集Set集合当中
        //需求：
        //把所有的男性收集起来
        Set<String> result2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(result2);

        //收集到Map集合当中
        //谁作为键：谁作为值
        //把所有的男性收集起来
        //键：姓名。值：年龄
        Map<String, Integer> result3 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(result3);


    }
}
