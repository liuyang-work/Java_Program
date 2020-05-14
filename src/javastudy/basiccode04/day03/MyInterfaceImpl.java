package javastudy.basiccode04.day03;



/**
 * @author : LiuYang
 * @data 2020-05-14 8:58
 */
public class MyInterfaceImpl  implements MyInterfaceA,MyInterfaceB{


    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写类A与B都有的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写冲突默认方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了A方法");

    }
}
