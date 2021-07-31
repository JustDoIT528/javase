package com.lmgzxh.javase.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 遍历，添加
*
* */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(11,"周小花");
        map.put(12,"周胖花");
        map.put(13,"周大花");
        map.put(11,"周肥花");//key重复value会覆盖

        //遍历Map集合很重要，几种方式都要会
        //第一种方式，先获取所有的key，遍历key的时候，通过key获取value

        Set<Integer> keys = map.keySet();
        for (Integer key : keys
             ) {
            System.out.println(key+"="+map.get(key));
        }

        //第二种方式：将Map集合转换为Set集合，Set集合中的每一个元素是Node
        //这个Node节点中有key和value
        Set<Map.Entry<Integer,String>> nodes = map.entrySet();

        for (Map.Entry<Integer,String> node :nodes
             ) {
            System.out.println(node.getKey()+"="+node.getValue());
        }
        

    }
}
