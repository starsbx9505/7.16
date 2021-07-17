package com.bxg.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
* JDK 8 的 快递 去 集合中的属性
* */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        Person diaochan = new Person();
            diaochan.setAge(18);
            diaochan.setHeight(168);
            diaochan.setName("貂蝉");

        Person xiaoqiao = new Person();
            xiaoqiao.setAge(16);
            xiaoqiao.setHeight(165);
            xiaoqiao.setName("小乔");

        Person daqiao = new Person();
            daqiao.setAge(18);
            daqiao.setHeight(170);
            daqiao.setName("大乔");

        //需求：给定一个list person对象的集合，需要一个 String 集合，该集合中的值是提取与上面3000个 list中的值把 美女的名字都存进去。
        List<Person> list = new ArrayList();
        list.add(diaochan);
        list.add(xiaoqiao);
        list.add(daqiao);
        System.out.println("list = " + list);

        List<String> names = new ArrayList<>();

       /* //1.遍历list集合 ，拿出对象的names付给新的names集合
        for(Person s : list){
            String name = s.getName();
            names.add(name);//2.赋值给新的集合
        }
        System.out.println("names = " + names);
        //以上是传统的，新的呢？JDK8 Stream（）
        */
       List<String> nameLists = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameLists = " + nameLists);
    }
}
