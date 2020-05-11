package liuyang.javastudy.day03;

/**
 * @author : LiuYang
 * @data 2020-04-24 9:43
 */
public class XunHuan {
    public static void main(String[] args) {
        int sum1=0;
        for(int i=1;i<=100 ;i++){
            if(i%2==0){
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);
    }
}
