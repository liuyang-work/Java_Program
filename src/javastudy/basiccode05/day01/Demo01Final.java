package javastudy.basiccode05.day01;

/**
 *final关键字代表最终、不可改变的
 * 1.可以用来修饰一个类
 * 2.可以用来修饰一个方法
 * 3.可以用来修饰一个局部变量
 * 4.可以用来修饰一个成员变量
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-15 16:13
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 =10;
        System.out.println(num1);
        num1 =20;
        System.out.println(num1);


        //一旦使用final用来修饰 局部变量，那么这个变量就不能改变
        //以此赋值，终生不变
        final int  num2 = 200;
        System.out.println(num2);

        //num = 200    错误写法！不能改变
        //num = 240    错误写法

        final int num;//正确写法，只要保证有唯一以此赋值即可
        num= 300;

        //对于常量来说，不可变，说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可变

    }
}
