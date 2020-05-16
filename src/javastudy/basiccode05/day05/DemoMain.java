package javastudy.basiccode05.day05;

/**
 * 如果接口的实现类，或者是父类的子类，只需要使用唯一一次
 * 那么这种情况就可以省略该类的定义，而改为使用（匿名内部类）
 * 匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称（）{
 *    //覆盖重写接口中所有抽象方法
 * }；
 *
 * 对格式“new 接口名（）{、、、}进行解析
 * 1.new代表穿创建对象的动作
 * 2.接口名称就是匿名内部类需要实现哪个接口
 * 3.{。。}这是匿名内部类的内容、
 *
 * 另外面还需注意几点问题：
 *1.匿名内部类在创建对象的时候，只能使用唯一一次
 *如果希望大队西创建对象，而且类的内容一样的话，那么久必须使用单独定义的实现类
 * 2.匿名对象在调用方法的时候，只能调用唯一一次，如果希望调用多次，那么必须取一个对象名字
 *
 *
 *
 * ClassName DemoMain
 * Description:
 * Create by liuyang
 * Date 2020/5/16 15:36
 */
public class DemoMain {
    public static void main(String[] args) {
  /*      MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();
*/

        //使用匿名内部类
        MyInterface obj1 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！");

            }
        };
        obj1.method();
//使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！");
            }
        }.method2();

        //因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象


    }
}
