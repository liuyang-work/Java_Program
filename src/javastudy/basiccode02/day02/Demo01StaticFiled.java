package javastudy.basiccode02.day02;

public class Demo01StaticFiled {
    public static void main(String[] args) {



        Student two = new Student("Linda",19);
        System.out.println("name:"+two.getName()+"--"+"" +
                "age:"+two.getAge()+"classroom:"+two.room+"id:"+two.getId());

        Student one = new Student("LIly",18);
        one.room = "101classroom";

        System.out.println("name:"+one.getName()+"--"+"" +
                ",age:"+one.getAge()+",classrom:"+one.room+",id:"+one.getId());



    }
}
