package javastudy.basiccode05.day01;

/**
 * 但final用来修饰一个方法，这个方法就是最终方法，就是不能被覆盖重写
 * 格式：
 * 修饰符 final 返回值类型 方法名称（参数列表）{
 *     、、
 * }
 *
 * 注意事项：
 * 对于类和方法来说，abstract和final是不能同时使用的，因为矛盾
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-15 16:21
 */
public class Fu {
    public  void method(){
        System.out.println("父类执行");
    }
}
