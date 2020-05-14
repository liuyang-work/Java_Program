package javastudy.basiccode04.day06;

/**
 * 访问成员变量的方法：
 * 1.直接通过对象名称访问：看等号左边是谁，优先用谁，没有则向上找
 * 2.间接通过成员方法访问：看该方法属于谁，就先用谁
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-14 10:56
 */
public class Demo01MultiField {
    public static void main(String[] args) {

        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);

        System.out.println("=======================");


        //子类没有覆盖重写，就是父类：10
        //子类如果覆盖重写，就是子：20
        obj.showNumber();

    }
}
