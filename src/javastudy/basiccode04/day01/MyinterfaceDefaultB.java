package javastudy.basiccode04.day01;

/**
 * @author : LiuYang
 * @data 2020-05-12 9:58
 */
public class MyinterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("BBB");
    }

    @Override
    public void methodDefault(){
        System.out.println("覆盖重写了默认");
    }


}
