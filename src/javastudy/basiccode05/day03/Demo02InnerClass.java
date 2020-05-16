package javastudy.basiccode05.day03;

/**
 * @author : LiuYang
 * @data 2020-05-16 10:59
 */
public class Demo02InnerClass {
    public static void main(String[] args) {

        //外部类名称.内部类名称 对象名称 = new 外部类名称().new 内部类名称();

        Outer.Inner obj = new Outer().new Inner();

        obj.methodInner();
    }
}
