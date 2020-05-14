package javastudy.basiccode04.day03;

/**
 * 使用接口时，需要注意，
 * 1.接口不能有静态代码块
 * 2.接口不能有构造方法
 * 3.一个类的直接父类是唯一的，但是一个类可以实现多个接口
 * 格式：
 * public class MyIntrfaceImpl impliment MyINterfaceA,MyinterfaceB{
 *
 * }
 * 4.如果实现类所实现的多个方法中，有重复的抽象方法方法，那么只需一次覆盖重写
 * 5.如果实现类没有覆盖重写所有接口中的所有方法，那么实现类就必须是抽象类
 * 6.如果实现类所实现的多个接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法覆盖重写
 * 7.一个类如果直接父类当中的方法，与接口中的默认方法有冲突，那么优秀选择父类方法
 *
 *
 * @author : LiuYang
 * @data 2020-05-14 8:53
 */
public class Demo01Interface {
    public static void main(String[] args) {
        Zi zi =new Zi();
        zi.method();

    }
}
