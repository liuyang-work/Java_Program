package javastudy.faceobject.day07;
/*
*无论是 成员变量，成员方法，如果没有，只会向上找，
* */

import javastudy.faceobject.day05.ZI;

public class Demo01ExtendsFeild {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodZi();
        zi.methodFu();
//方法名一样，创建的是谁就用谁
        zi.method();
    }
}
