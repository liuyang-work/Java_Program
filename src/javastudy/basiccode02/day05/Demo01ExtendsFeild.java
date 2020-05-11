package javastudy.basiccode02.day05;
//the method belongs to who,use who,if dont have .then go up
public class Demo01ExtendsFeild {
    public static void main(String[] args) {

        Fu fu = new Fu();
        System.out.println(fu.numFu);

        ZI zi = new ZI();

        System.out.println(zi.numFu);
        System.out.println(zi.numZii);


        System.out.println("=================");
        //谁定义就用谁，看等号
        System.out.println(zi.number);
        System.out.println("==============");

        zi.methodZi(); //200

        //这个方法是谁的
        zi.methodFu();//100
    }


}



