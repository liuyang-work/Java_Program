package liuyang.javastudy.day07;

/**
 * @author : LiuYang
 * @data 2020-04-27 20:55
 */
public class Student {

    String name;
    int age;


    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
