package javastudy.basiccode04.day01;

/**
 * 接口就是多各类的公共规范
 * 接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
 * 如何定义一个接口：
 * public interface 接口名称{
 *     //接口 内容
 * }
 *
 * 备注：换成关键字interface后，编译生成的字节码文件还是：.java--->.class
 *
 * 如果是Java7：那么接口中可以包含的内容有：
 * 1.常量
 * 2.抽象方法
 *
 * 如果是Java8,还可以额外包含有：
 * 3.默认方法
 * 4.静态方法
 *
 *
 * Java9：
 * 5.私有方法
 *
 * 接口使用方法：
 * 1.接口不能直接使用，必须有一个“实现类”来实现该接口
 * 格式：
 * public class 实现类名称 implement 接口名称{
 *
 * }
 * 2.接口的实现类必须覆盖重写（实现）接口中的所以抽象方法
 * 实现：去掉abstract关键字，加上方法体大括号‘
 * 3.创建实现类的对象进行使用
 *
 * 注意事项：
 * 如果实现类没有全部覆盖重写接口中的所有抽象方法，那么这个类自己就必须是抽象类
 *
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-12 9:27
 */
public class DemoInterface {
    public static void main(String[] args) {
        MyInterfaceAbstractimpl impl = new MyInterfaceAbstractimpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }


}
