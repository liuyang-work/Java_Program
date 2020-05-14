package javastudy.basiccode04.day01;

/**
 * 问题描述：需要抽取一个公共方法，用来解决默认方法直接重复代码问题
 * 但是这个共有方法不应该让实现类使用，应该是私有化的
 *
 * 解决方案：
 * 从Java9开始，接口中允许定义私有方法：
 * 1.普通私有方法,解决多个默认方法之间的代码重复问题
 * 格式：
 * private 返回值类型 方法名称（参数列表）{
 *    //方法体
 * }
 * 2.静态私有方法，解决多个静态方法之间的代码重复问题
 * 格式：
 * private static 返回值类型 方法名称（参数列表）{
 *  *    //方法体
 *  * }
 *
 *
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-12 10:25
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1() {
        System.out.println("AAA");
        methodCommon();
    }
        public default void methodDefault2(){
            System.out.println("BBB");
            methodCommon();

    }

    public default void methodDefault3(){
        System.out.println("CCC");
        methodCommon();

    }

    private void methodCommon(){

        System.out.println("默认方法");
        System.out.println("默认方法");
        System.out.println("默认方法");
        System.out.println("默认方法");
    }
}
