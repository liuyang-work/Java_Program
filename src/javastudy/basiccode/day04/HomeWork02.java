package liuyang.javastudy.day07;

import java.util.ArrayList;

/**
 * @author : LiuYang
 * @data 2020-04-27 20:54
 */
/*

* */
public class HomeWork02 {
    public static void main(String[] args) {

        //自定义四个学生对象
        Student stu1 = new Student("迪丽热巴",18);
        Student stu2 = new Student("古力娜扎",28);
        Student stu3 = new Student("辛格拉瓦",38);
        Student stu4 = new Student("八嘎啦路",48);

        //添加进集合

        //创建

        ArrayList<Student> list = new ArrayList<>();

        //添加进列表
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        //遍历列表
        for (int i = 0; i < list.size(); i++) {
            Student s =  list.get(i);
        //输出名字和年龄
            System.out.println(s.getName()+"-----"+ s.getAge());
        }






    }
}
