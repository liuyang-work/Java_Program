package javastudy.basiccode04.day07;

/**
 * @author : LiuYang
 * @data 2020-05-14 20:53
 */
public class Cat extends Animal {


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    //子类特有方法
    public void catMouse(){
        System.out.println("猫抓老鼠");
    }
}
