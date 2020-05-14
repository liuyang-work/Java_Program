package javastudy.basiccode04.day06;

import java.io.PushbackInputStream;

/**
 * @author : LiuYang
 * @data 2020-05-14 10:55
 */
public class Fu {
    int num = 10;

    public void showNumber(){
        System.out.println(num);
    }

    public void method(){
        System.out.println("父类方法");
    }



    public void methodFu(){
        System.out.println("父类特有方法");
    }
}
