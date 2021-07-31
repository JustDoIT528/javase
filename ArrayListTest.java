package com.lmgzxh.javase.review;

import java.util.ArrayList;
import java.util.Iterator;

/*
*掌握：1.1每个集合对象的创建（new）
*      1.2向集合中添加元素
*       1.3从集合中取出某个元素
*       1.4遍历集合
*
* */
public class ArrayListTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("周小花");
        list.add("周大花");
        list.add("周胖花");

        //从集合中取元素
        //遍历
        /*for (String s :list
             ) {
            System.out.println(s);
        }*/
        /*下标方式
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        //遍历，迭代器方式(通用的，所有的Collection都能用)

      /* Iterator it = list.iterator();

       while(it.hasNext()){
           System.out.println(it.next());
       }*/

    }
}
