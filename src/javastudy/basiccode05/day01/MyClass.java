package javastudy.basiccode05.day01;

/**
 * 当final关键字用来修饰一个类的时候，格式：
 * public final class 类名称{
 *     //。。。
 * }
 *
 * 含义：当前这个类不能有任何子类。（太监类）
 *注意：一个类如果是final，那么其中所有的成员方法都无法进行覆盖重写（因为没儿子）
 *
 *
 * @author : LiuYang
 * @data 2020-05-15 16:15
 */
public final class MyClass {
    public void method(){
        System.out.println("final类");
    }

}
