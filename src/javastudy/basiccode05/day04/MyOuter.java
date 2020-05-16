package javastudy.basiccode05.day04;
/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是（有效final类）

从Java8+开始，只要局部变量事实不变，那么关键字final可以省略

原因：
1.new出来的对象是在堆内存当中
2.局部变量是跟着方法走的，在栈内存当中
3.方法运行结束后立刻出栈，局部变量会立刻消失
4.但是new出来的对象会在栈当中持续存在，直到垃圾回收
 */
/**
 * ClassName MyOuter
 * Description:
 * Create by liuyang
 * Date 2020/5/16 15:16
 */
public class MyOuter {
    public void methodOuter(){
        int num =10;  //所在方法的局部变量

        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }

    }
}
