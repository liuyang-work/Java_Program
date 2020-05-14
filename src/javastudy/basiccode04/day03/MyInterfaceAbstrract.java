package javastudy.basiccode04.day03;

/**
 * @author : LiuYang
 * @data 2020-05-14 9:09
 */
public abstract class MyInterfaceAbstrract implements MyInterfaceA,MyInterfaceB {



    @Override
    public void methodB() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写冲突默认方法");
    }
}
