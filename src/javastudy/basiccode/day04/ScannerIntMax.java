package liuyang.javastudy.day07;
import java.util.Scanner;

/**56
 * @author : LiuYang12
 * @data 2020-04-26 11:04
 */
public class ScannerIntMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = scan.nextInt();
        System.out.println("请输入第二个整数：");
        int b = scan.nextInt();
        System.out.println("请输入第三个整数：");
        int c = scan.nextInt();
        int max = max(a, b, c);
        System.out.println("最大数是:"+max);

    }

    public static int max(int x,int y,int z){
        int max=x;
        max=x>y?x : y;
        max = max > z? max :z;    //创建一个方法，返回三个整数的最大值
        return max;
    }
}
