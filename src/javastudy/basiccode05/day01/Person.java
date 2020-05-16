package javastudy.basiccode05.day01;

/**
 * 对于变量来说，如果使用final关键字来修饰，那么这个变量也照样是不可变
 *
 * 1.由于成员变量具有默认值，那么用了final之后必须手动赋值，那么久不会在给默认值了
 * 2.对于final的成员变量，要么使用直接赋值，要么使用构造方法赋值。二者选其一；
 *3.必须保证类当中所有的重载方法都最终会对final的成员变量进行赋值
 *
 *
 * @author : LiuYang
 * @data 2020-05-15 16:47
 */
public class Person {

    private final String name;

    public Person(){
        name = "关晓彤";
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

}
