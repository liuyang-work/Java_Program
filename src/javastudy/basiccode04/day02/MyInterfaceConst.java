package javastudy.basiccode04.day02;

/**
 * 接口中也可以定义“成员变量”，但是因为这个成员变量
 * 必须使用public、static、final三个关键字来修饰
 * 从效果上看，这就是接口的”常量“
 * 格式：
 * public static final 数据类型 变量名称 = 数据值；
 *注意：
 * 一旦使用final关键字进行修饰，说明不可变
 * 1.接口中的常量，可以省略关键字，不写也是照样这样
 * 2.接口中常量，必须赋值，不能不赋值
 * 3.接口中常量，全部使用大写字母命名，多个单词用下划线分割
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-13 20:01
 */
public interface MyInterfaceConst {
    //这就是一个常量，一旦赋值，不可以修改
    public static final int NUM = 10;

}
