package javastudy.basiccode03.day09;

/**
 * @author : LiuYang
 * @data 2020-05-11 17:15
 */
public class DemoMain {
    public static void main(String[] args) {
        //Dog dog = new Dog();
        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();


        System.out.println("====================");

        GoldenDog goldenDog = new GoldenDog();
        goldenDog.eat();
        goldenDog.sleep();
    }
}
