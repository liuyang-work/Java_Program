package javastudy.basiccode03.day08;

import javastudy.basiccode02.day05.ZI;

/**
 *一个抽象类不一定有抽象方法，只要保证抽象方法所在类是抽象类，即可
 *
 *
 * @author : LiuYang
 * @data 2020-05-11 17:02
 */
public class DemoMain {
    public static void main(String[] args) {
        Zi zi = new Zi() ;
        zi.eat();
    }
}
