/*final
     1、final是java语言中的一个关键字
     2、final表示最终的，不可变的
     3、final可以修饰变量及方法，还有类等
     4、final修饰的变量？
        final修饰的局部变量，一旦赋值不能重新赋值。
     5、final修饰的方法？
        final修饰的方法无法被覆盖，被重写。
     6、final修饰的类？
        final修饰的类无法继承。
     7、final控制不了能不能调用的问题。final管的是啥？
        final修饰的表示最后的，不能变的，不能改的。
 */

public class FinalTest01 {
    public static void main(String[] args) {
        final int k=100;
//        k=200;
    }
}

//B类继承A类，相当于对A类的功能进行扩展。如果不希望别人对A类型进行扩展
//可以使用final关键字，这样的话A类就无法继承了。
/*
final class A{

}
class B extends A{

}*/
