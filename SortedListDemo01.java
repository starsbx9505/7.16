package com.bxg.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序集合！！！对集合进行自然排序（从小到大）
 * 他只能对list排序，对set不可以，因为set是无序的
 */
public class SortedListDemo01 {
    public static void main(String[] args) {
        //纯数字排序
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(20);
        list.add(10);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);

        //纯字符串  根据字符编码排序
        List<String> list1 = new ArrayList<>();
        list1.add("博君一肖");
        list1.add("占山为王");
        list1.add("连琐反应");
        list1.add("百香果");
        list1.add("巴西龟");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);
        System.out.println("list1 = " + list1);

        //对象的排序（应用的地方很广） 对对象属性的排序
        Person p1 = new Person();
            p1.setName("小乔");
            p1.setAge(16);
            p1.setHeight(155);
        Person p2 = new Person();
            p2.setName("大乔");
            p2.setAge(18);
            p2.setHeight(168);
        Person p3 = new Person();
            p3.setName("貂蝉");
            p3.setAge(16);
            p3.setHeight(160);
        Person p4 = new Person();
            p4.setName("瑶");
            p4.setAge(19);
            p4.setHeight(173);
        Person p5 = new Person();
            p5.setName("蔡文姬");
            p5.setAge(16);
            p5.setHeight(150);
            List<Person> personList = new ArrayList<>();
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            personList.add(p4);
            personList.add(p5);
        System.out.println("personList = " + personList);
        Collections.sort(personList);
        System.out.println("personList = " + personList);
        Collections.reverse(personList);
        System.out.println("personList = " + personList);
        //练习：按年龄 从大到小排序
        //作业1.按照person的名字长度排序，诸葛孔明，
    }
}
