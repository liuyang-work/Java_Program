package javastudy.basiccode02.day04;
/*
在继承的关系中，“子类就是一个父类”

父内定义和普通内没区别

父类：
public class fathertype{
        //...
}

子类：
publci class sontype extends fathertype{
    //....
}
* */
public class Demo01Extends {

    public static void main(String[] args) {
        //创建noe sontype object
        Teacher teacher = new Teacher();
        teacher.method();
        //the other sontype
        Assitant assitant = new Assitant();
        assitant.method();

    }

}
