package javastudy.basiccode03.day01;

/*
* 覆盖重写注意事项：
* 1.必须保证父子类之间的方法名称必须相同
* @Override，写在方法前面，用来检测是不是有效的正确的覆盖重写
* 这个注解，不写，只要满足要求也是覆盖重写
* 2.子类方法的返回值必须小于等于父类方法的返回值范围
* 提示：java.lang.Object类是所有类的公共最高父类（祖宗类）。Java.lang.String就是object的子类
*
* 3.子类方法的权限必须大于等于父类方法的权限
* 提示：public 》protected》（default）>privat
* 注意：（default）不是关键字default，而是什么都不写，留空
*
* 设计原则：对于已经投入使用的类，尽量不要进行修改，
* 推荐定义一个新的类，来重复利用其中共性内容，并且添加改动新内容
* */

import java.security.PublicKey;

/**
 * @author : LiuYang
 * @data 2020-05-10 15:13
 */
public class Demo01Override {
    public static void main(String[] args) {

    }
}
