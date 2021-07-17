package com.bxg.collection;
/*
* 集合：非常重要！！！
*
* */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDome {
    public static void main(String[] args) {
        //ArrayList c1 = new ArrayList();
        Collection c1 = new ArrayList();
        //add 增加
        c1.add("唐僧--执着的目标");
        c1.add("吉吉国王--过硬的技术");
        c1.add("猪八戒--老色批，体贴关心");
        c1.add("臭咸鱼--文中的劳动");
        c1.add("白龙马--出门的面儿");
        System.out.println("c1 = " + c1 );
        //尺寸
        int size = c1.size();
        System.out.println("size =" + size );
        boolean empty = c1.isEmpty();
        System.out.println("empty = " + empty);
        //集合的清空
        //c1.clear();
        //System.out.println("c1 = " + c1);
        boolean empty1 = c1.isEmpty();
        System.out.println("empty1 = " + empty1);
        //集合的遍历  3种
        //No.1
        /*for (int i = 0; i < c1.size(); i++) {
            System.out.println("c1 = " + c1.get(i));

        }*/
        //思考题：为什么collection不能使用for循环？？？换句话说，为什么不能根据索引来取值？
        //因为set集合没有索引下标，索引for循环不能使用到collection中
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
        //迭代器 和 for循环的区别
        //迭代器工作：有游标，问下一个，有没有下一个元素，如果有，就拿出，没有就结束
        //for循环的工作：把集合从0----N 排序，从0开始，拿下标，解释了 为什么学了for循环后，在学一个迭代器
    }








}
