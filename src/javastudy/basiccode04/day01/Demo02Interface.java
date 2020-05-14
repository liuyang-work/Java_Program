package javastudy.basiccode04.day01;

/**
 * 1.接口默认方法可以通过接口实现类直接调用
 * 2.接口默认方法也可以被接口实现类覆盖重写
 *
 *
 * @author : LiuYang
 * @data 2020-05-12 10:03
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyinterfaceDefaultA a = new MyinterfaceDefaultA();
        a.methodAbs();//调用抽象方法，实际运行的是右侧实现类

        a.methodDefault(); //调用默认方法，如果实现类没有，会向上找接口
        System.out.println("================");
        MyinterfaceDefaultB b =  new MyinterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
