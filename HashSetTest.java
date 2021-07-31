package com.lmgzxh.javase.review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/*
* 掌握：1.1每个集合对象的创建（new）
 *      1.2向集合中添加元素
 *       1.3从集合中取出某个元素
 *       1.4遍历集合
 * 特点：无序不可重复
 *      相当于存在HashMap的key中，需要重写HashCode()和equals方法。
 * */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("周小花");
        hashSet.add("周小花");//无序不重复

        hashSet.add("李棒槌");

        //Set集合中没有下标

        Iterator it = hashSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String s:hashSet
             ) {
            System.out.println(s);
        }

        //创建Set集合，存储Student数据
        Set<Student> studentSet = new HashSet<>();

        Student s1 = new Student(111,"周小花");
        Student s2 = new Student(222,"周大花");
        Student s3 = new Student(133,"周胖花");
        Student s4 = new Student(222,"周大花");

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);

        System.out.println(studentSet.size());

        for (Student s:studentSet
             ) {
            System.out.println(s);
        }

    }
}
class Student{
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}