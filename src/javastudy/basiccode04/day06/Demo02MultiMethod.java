package javastudy.basiccode04.day06;

/**
 * 在多态的代码当中，成员方法的访问规则是：
 * new的是谁就用谁,没有就往上找
 *
 * 口诀：编译看左边，运行看右边
 *
 * 成员变量：
 * 编译看左边，运行也看左边
 * 成员方法：
 * 编译看左边，运行看右边
 *
 *
 *
 *
 * @author : LiuYang
 * @data 2020-05-14 20:11
 */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();  //多态


        obj.method();  //父子都有，优先用子
        obj.methodFu(); //子类没有，父类有，向上找父类


        //obj.methodZi();  //错误写法

    }

}
