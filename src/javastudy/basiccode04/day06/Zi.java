package javastudy.basiccode04.day06;

/**
 * @author : LiuYang
 * @data 2020-05-14 10:55
 */
public class Zi extends Fu {
    int num = 20;

    @Override
    public void showNumber() {
        System.out.println(num);

    }


    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
