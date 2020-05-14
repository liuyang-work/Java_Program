package javastudy.basiccode04.day04;

/**
 * 这个子接口有多少个方法？4个
 * methodA
 * methodB
 * methodCommon
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-14 9:25
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();


    @Override
    public default void methodDefault() {

    }
}
