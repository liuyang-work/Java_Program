package javastudy.basiccode04.day04;

import javax.crypto.interfaces.PBEKey;

/**
 * @author : LiuYang
 * @data 2020-05-14 9:25
 */
public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("这是默认方法");
    }
}

