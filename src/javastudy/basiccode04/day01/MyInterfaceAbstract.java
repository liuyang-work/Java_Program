package javastudy.basiccode04.day01;

/**
 * 在任何版本的Java中，都可以定义抽象方法
 *
 * public abstract 返回值类型 名称();
 * 注意：
 * 1。接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
 * 2.这两个可以选择性的省略（今天不推荐）
 * 3.方法的三要素，可以随意定义
 * @author : LiuYang
 * @data 2020-05-12 9:34
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodAbs1();

    //这也是抽象方法
    abstract void methodAbs2();

    //这也是
    public abstract void methodAbs3();

    //这也是
    void methodAbs4();
}
