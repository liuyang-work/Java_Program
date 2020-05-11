package liuyang.javastudy.day03;

/**
 *
 * @author : LiuYang
 * @data 2020-04-24 9:28
 */
public class CaseTest {
    public static void main(String[] args) {
        int i = 5;
        switch (i) {
            case 1:
                System.out.println("执行case1");
                break;
            case 5:
                System.out.println("执行case5");
            case 10:
                System.out.println("执行case10");
            default:
                System.out.println("执行default");
        }
    }
}