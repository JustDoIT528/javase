/*final修饰的实例变量
    final修饰的实例变量一般添加static修饰

    终极结论：
        static final联合修饰的变量称为“常量”。
        常量名建议全部大写，每个单词之间采用_衔接。

     常量：实际上常量和静态变量一样，区别在于：
        常量的值不能变。
        常量和静态变量，都是存储在方法区，并且都是在类加载时初始化。
* */

public class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
    }
}
class Chinese{
//    身份证号
    String idCard;
//    姓名
    String name;
//    国家
   public static final String COUNTRY="中国";//static静态的，存储在方法区。
    //可以公开，因为根本改不了。

}