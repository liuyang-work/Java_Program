package javastudy.faceobject.day03;

/*
Math 是数学类工具
1.public static double abs(double num);绝对值
2.public static double ceil(double num);向上取整
3.public static double floor(double num);向下取整
4.public static double round(double num);四舍五入

5.Math.PI

* */
public class Demo03Math {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(2.1));
        System.out.println(Math.abs(-3.14));

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println("============");


        //向下取整
        System.out.println(Math.floor(2.14));
        System.out.println(Math.floor(3.19));
        System.out.println(Math.floor(30.9));

        //四舍五入
        System.out.println(Math.round(12.4));
        System.out.println(Math.round(12.9));
        System.out.println(Math.round(12.5));

    }
}
