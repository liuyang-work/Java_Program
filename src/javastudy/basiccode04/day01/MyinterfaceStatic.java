package javastudy.basiccode04.day01;

/**
 * 从Java8开始，接口允许定义静态方法
 * 格式：
 * Public static 返回值类型 方法名称（参数列表）{
 *     方法体
 * }
 * 提示：就是将abstract或者default换成static即可，带上方法体
 *
 *
 * @author : LiuYang
 * @data 2020-05-12 10:14
 */
public interface MyinterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是静态方法");
    }

}
