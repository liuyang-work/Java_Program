package javastudy.basiccode04.day03;

/**
 * @author : LiuYang
 * @data 2020-05-14 9:18
 */
public interface MyInterface {
    public default void method(){
        System.out.println("默认方法");
    };

}
