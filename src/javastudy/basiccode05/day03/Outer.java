package javastudy.basiccode05.day03;

import java.rmi.server.RMIClassLoaderSpi;
import java.sql.SQLOutput;

/**
 * 如果出现成员变量；
 * 那么格式是：外部类名称.this.成员变量
 *
 *
 * @author : LiuYang
 * @data 2020-05-16 10:52
 */
public class Outer {
    int num =10;  //外部成员变量


    public class Inner extends Object{
        int num =20;  //内部成员变量

        public void methodInner(){
            int num  = 30;  //内部方法的局部变量
            System.out.println(num);  //30
            System.out.println(this.num);  //20
            System.out.println(Outer.this.num);  //10,外部类成员变量
        }

     }
}
