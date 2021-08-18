/*实例变量没有手动赋值的话，系统会默认赋值
* 结论：final修饰的实例变量，系统不管默认赋值，要求程序员必须手动赋值
* 实例变量在什么时候赋值（初始化）？
*   构造方法执行的过程中赋值。（new的时候赋值）
*
* 终极结论：
*       final修饰的实例变量系统不负责赋默认值，要求程序员必须手动赋值。
*       这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。
* */

public class FinalTest03 {
    public static void main(String[] args) {

        User u = new User();
        System.out.println(u.height);
    }
}
class User{
    final double height = 1.8;

    final double weight;

    public User() {
        this.weight = 60;//赶在系统赋默认值之前执行
    }
}