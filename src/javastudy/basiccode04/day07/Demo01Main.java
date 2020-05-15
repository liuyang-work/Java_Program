package javastudy.basiccode04.day07;

/**
 * 向上转型一定是安全的 ，没有 问题的，正确的，但是也有弊端
 * 一旦向上转型为父类，就无法调用子类原本特有的内容了
 *
 * 解决方案：
 * 用对象的向下转型，[还原]
 *
 * @author : LiuYang
 * @data 2020-05-14 20:54
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型就是：父类引用指向子类对象

        Animal animal  = new Cat();
        animal.eat();
        //  本来是猫，被当做动物，还原成猫，然后调用子类特有方法；
        Cat cat = (Cat)animal;
        cat.catMouse();

        Dog dog = (Dog)animal;//会报错，类转换异常（classCastException）


    }
}
