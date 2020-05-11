package liuyang.javastudy.day02;

/**
 * @author : LiuYang
 * @data 2020-04-24 8:59
 */
public class SanYuan {
    public static void main(String[] args) {
        int a=4;
        int b=6;
        int max=sanYuan(a, b);
        System.out.println(max);
    }

    public static int  sanYuan(int x,int y ) {  //方法类似于C语言的函数！
        int c= x > y ? x:y;
        return c;
    }
}
