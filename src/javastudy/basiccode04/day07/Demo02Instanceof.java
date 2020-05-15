package javastudy.basiccode04.day07;

/**
 * 如何才能知道一个父类引用的对象，本来是什么子类
 *
 * 格式：
 * 对象 instanceof 类型
 * 这会得到一个布尔值结果，也就是判断前面对象能否当做后面类型的实例
 *
 *
 * @author : LiuYang
 * @data 2020-05-14 21:20
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();   //本来是一直猫
        animal.eat();  //猫吃鱼


        //如果希望调用子类特有方法，需要向下转型
        //判断一下animal是不是dog
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }

        //判断一下animal是不是cat
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){

        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }

        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }

    }



}
