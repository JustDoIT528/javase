/*
* final修饰的变量，如果这个变量是一个“引用”会怎样？
*       《重点》final修饰的变量只能赋一次值。
*       该引用只能指向一个对象，并且他永远指向该对象，无法再指向其他对象。
*       并且在该方法执行过程中，该引用指向对象之后，该对象不会被垃圾回收器回收。
*       直到当前方法结束，才会释放空间。
* */

public class FinalTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(12);
        System.out.println(p1.age);
        System.out.println("-------------------------");

        final Person p2 = new Person(34);

//        p2 = new Person(40);只能赋一次值


    }
}
class Person{
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }
}