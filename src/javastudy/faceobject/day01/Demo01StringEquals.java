package javastudy.faceobject.day01;
/*
* public booleann Equals(Object) obj),can use any cnashu,only the canshu is a string
* and the content is equals.it will be true ,or it{ false
*
* 1.equals has the duichenxing ,&str1.Equals(str2)==str1.Equals(str2)str2.Equals(str1)
* if use a string compared whit a bianliang ,use "hello".Equals(str1)
*
* 2.equalsIgnoreCase()    ignore the Letter case   a==A
* */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));

        String str4 = "hello";
        System.out.println(str1.equals(str4));


        System.out.println("===========================");

        String str5 = "a";
        System.out.println("A".equalsIgnoreCase(str5));







    }
}
