package javastudy.faceobject.day02;
/*
* 静态代码块
* public class name{
*   static{
*       //静态代码块
* }
* }
*
* //特点，，当第一次用到本类时，只执行一次
* */
public class Person {

    static {
        System.out.println("静态代码块");
    }

    public Person(){
        System.out.println("构造方法");

    }
}
