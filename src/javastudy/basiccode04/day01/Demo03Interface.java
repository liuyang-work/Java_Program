package javastudy.basiccode04.day01;

/**
 * 注意：不能通过接口实现类的对象来调用接口中的静态方法
 * 正确用法：
 * 格式：
 * 接口名称.静态方法（参数）
 *
 *
 * @author : LiuYang
 * @data 2020-05-12 10:18
 */
public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceAbstractimpl impl    =  new MyInterfaceAbstractimpl();
        //直接通过接口名称调用静态方法
        MyinterfaceStatic.methodStatic();
    }


}
