package javastudy.basiccode03.day09;

/**
 * @author : LiuYang
 * @data 2020-05-11 17:07
 */

//子类也是一个抽象类
public abstract class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

   // public abstract void sleep();
}
