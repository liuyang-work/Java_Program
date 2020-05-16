package javastudy.basiccode05.day04;


/*
如果一个类是定义在方法内部的，那么这就是一个局部内部类
“局部”，只有当前所有的方法才能使用它，出了这个方法外面就不能用了
定义格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称（参数列表）{
        class 局部类名称{
        、、、、、
        }

    }

}

小结一下类的权限修饰符：
public》protected》（defau）》priva
定义一个类的时候，权限修饰符可以使用的规则；
1.内部类，public/(default)
2.成员内部有类：public、protected、defaul、private
3.局部内部类：什么都不能写

 */
/**
 * ClassName Outer
 * Description:
 * Create by liuyang
 * Date 2020/5/16 14:57
 */
public class Outer {

    public void methodOuter(){
        class Inner{     //局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }

        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
