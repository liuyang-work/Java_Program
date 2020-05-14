package javastudy.basiccode04.day01;

/**
 * @author : LiuYang
 * @data 2020-05-13 19:52
 */
public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法AAA");
        methodStaticCommon();
    }
    public static void methodStatic2(){
        System.out.println("静态方法BBB");
        methodStaticCommon();

    }



    private static void methodStaticCommon(){

        System.out.println("默认方法");
        System.out.println("默认方法");
        System.out.println("默认方法");
        System.out.println("默认方法");
    }
}
