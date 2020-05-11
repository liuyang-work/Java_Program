package javastudy.basiccode03.day03;

/**
 * 继承关系中，父子构造方法的访问特点；
 * 1.子类构造方法当中有一个默认的super()；调用，所以一定是先调用的父类构造,后执行子类方法
 * 2.子类构造可以通过super关键字来调用父类重载构造
 * 3.super的分类构造调用必须是子类构造方法的第一个语句.不能一个子类构造调用多次super构造
 * 总结：
 * 子类必须调用父类构造方法，不写则赠送super()，写了则用写的指定super（）调用，还必须是第一个
 * @author : LiuYang
 * @data 2020-05-10 15:46
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}
