package javastudy.faceobject.day02;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room ="101classroom";


        Student one = new Student("lili",19);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(Student.room);

        Student two = new Student("lala",20);
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Student.room);



    }
}
