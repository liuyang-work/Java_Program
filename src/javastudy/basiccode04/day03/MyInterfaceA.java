package javastudy.basiccode04.day03;

/**
 * @author : LiuYang
 * @data 2020-05-14 8:57
 */
public interface MyInterfaceA {
    public void methodA();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
