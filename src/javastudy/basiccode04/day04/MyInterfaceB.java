package javastudy.basiccode04.day04;

/**
 * @author : LiuYang
 * @data 2020-05-14 9:25
 */
public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("这是默认方法");
    }
}
