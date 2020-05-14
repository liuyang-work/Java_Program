package javastudy.basiccode04.day03;

/**
 * @author : LiuYang
 * @data 2020-05-14 8:58
 */
public interface MyInterfaceB {
    public void methodB();
    public abstract void methodAbs();


    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
