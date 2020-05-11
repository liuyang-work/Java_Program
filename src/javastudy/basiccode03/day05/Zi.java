package javastudy.basiccode03.day05;

import java.sql.SQLOutput;

/**
 * super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种
 * 1.在本类成员方法中访问本类的成员变量
 * 2.在本类的成员方法中访问本类的另一个成员方法
 * 3.本类的构造方法中访问本类的另一个构造方法
 * 在第三种用法中，也要注意
 * a.this(...)也必须是构造方法的第一个语句，唯一一个
 * b.super和this不能同时使用
 * @author : LiuYang
 * @data 2020-05-10 16:43
 */
public class Zi extends Fu {
    int num=10;

    public Zi(){
        this(123); //本类的无参构造，调用本类的有参构造
    }

    public Zi(int n){

    }
    public void showNum(){
        int num =10;
        System.out.println(num); //局部变量
        System.out.println(this.num); //本类的成员变量
        System.out.println(super.num);//父类的成员变量
    }

    public void methodA(){
        System.out.println("AAA");

    }
    public void methodB(){
        this.methodA();
        System.out.println("BBB");


    }
}
