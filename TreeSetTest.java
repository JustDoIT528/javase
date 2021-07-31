package com.lmgzxh.javase.review;
import java.util.Comparator;
import java.util.TreeSet;
/*
* TreeSet实现了SortedSet接口，会排序，但前提条件是重写了compareTo()方法。
* 或者实现Comparable接口（重写compareTo方法），传入比较器(new Comparator)。
* 编写比较器可以改变规则。
* */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//本来Integer写好了是降序，这里传入比较器来实现升序。
                            //运行时先判断有无比较器。
            }
        });
        ts.add(1);
        ts.add(100);
        ts.add(1008);
        ts.add(999);
        ts.add(666);
        ts.add(666);

        for (Integer i:ts
             ) {
            System.out.println(i);
        }

        TreeSet<Animal> ts2 = new TreeSet<>();

        Animal a1 = new Animal(11);
        Animal a2 = new Animal(33);
        Animal a3 = new Animal(22);
        Animal a4 = new Animal(66);
        Animal a5 = new Animal(44);

        ts2.add(a1);
        ts2.add(a2);
        ts2.add(a3);
        ts2.add(a4);
        ts2.add(a5);

        for (Animal a:ts2
             ) {
            System.out.println(a);//java.lang.ClassCastException
                                    //未实现Comparable接口或者未编写Compartor比较器
                                    //报向下转型异常
        }

    }
}
class Animal implements Comparable<Animal>{
    int age;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Animal a) {
        int a1 = this.age;
        int a2 = a.age;
        return a1-a2;
    }
}

//写一个比较器
class Bcomparator implements Comparator<Animal>{


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.age - o2.age;
    }
}