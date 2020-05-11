package liuyang.javastudy.day07;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.xml.transform.Result;
import java.util.Random;
import java.util.Scanner;

/**
 * @author : LiuYang
 * @data 2020-04-27 15:45
 */

/*
生成一个0-100的随机数；产生后不变；
然后二分法查找，
比较大小，让后除以二靠近猜
*/
public class GuessNum {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100);
        int num = n;
        System.out.println("我的数字："+n);
        System.out.println("我已经准备好了请你猜一猜吧");



        Scanner sc = new Scanner(System.in);
        int num1 = 0;

        do {
             num1 = sc.nextInt();

            System.out.println("我猜是:"+num1);


            if(num1 == num ){break;}
            else if(num1 > num){
                System.out.println("你猜大了哦，再猜：");

            }
            else {
                System.out.println("你猜小了哦，再猜：");
            }

        }while ( num1 != num );

        System.out.println("恭喜你猜对了");


    }

}
