package javastudy.basiccode02.day07;
/*
*无论是 成员变量，成员方法，如果没有，只会向上找，绝对不会向下找子类
*
* 重写（override）//覆盖
* 概念：在继承关系中，方法名一样，参数列表页一样
* 重载：方法名一样，参数列表不一样，
*
*覆盖重写特点，创建得是子类对象，优先使用子类
* */

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodZi();
        zi.methodFu();
//方法名一样，创建的是谁就用谁
        zi.method();
    }
}
