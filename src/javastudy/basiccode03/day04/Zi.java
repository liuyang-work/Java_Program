package javastudy.basiccode03.day04;

import javax.crypto.Cipher;

/**
 * super的关键字的用法有三种
 * 1.在子类的成员方法中访问父类的成员变量
 * 2.在子类的成员方法中访问父类的成员方法
 * 3.在子类的构造方法中访问父类的构造方法
 * @author : LiuYang
 * @data 2020-05-10 16:35
 */
public class Zi extends Fu {

    int num =20;
    public  Zi(){
        super();
    }


    public void Method(){
        System.out.println(super.num);
    }


    public void method(){
        super.method();
        System.out.println("子类方法");
    }
}
