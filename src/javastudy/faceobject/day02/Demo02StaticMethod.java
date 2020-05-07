package javastudy.faceobject.day02;

import java.util.zip.DeflaterOutputStream;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass test = new MyClass();
        test.method();

        test.methodStatic();//don't recommand
        MyClass.methodStatic();//recommand

        myMethod();
    }

    public static void myMethod(){
        System.out.println("this is my method");
    }

}
