package liuyang.javastudy.day07;
import java.util.Scanner;
/**
 * @author : LiuYang
 * @data 2020-04-26 10:26
 */
public class ScannerIntSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //创建输入的对象

        //使用对象成员方法

        int a = scan.nextInt();  //输入一个整数
        int b = scan.nextInt();
        int sum1 = a + b;
        System.out.println("两个数的和是" + sum1);

    }
}

