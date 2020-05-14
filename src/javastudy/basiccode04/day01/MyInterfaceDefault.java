package javastudy.basiccode04.day01;

/**
 *从Java8开始，接口允许定义默认方法
 * 格式：
 * public default 返回值类型 方法名称（）{
 *     方法体
 * }
 *
 * 备注：接口担当中的默认方法，可以解决接口升级问题
 *
 *
 * @author : LiuYang
 * @data 2020-05-12 9:52
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //也是抽象方法
   // public abstract void methodAbs2();

    //新添加的方法改为默认方法就可以解决问题

    public default void methodDefault(){
        System.out.println("这是新的默认方法");
    }
}
