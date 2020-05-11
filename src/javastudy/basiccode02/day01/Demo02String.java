package javastudy.basiccode02.day01;

//==is used to compare numbervalue,can't compare adrress

public class Demo02String {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";

        char[] charArrar = {'a', 'b', 'c'};
        String str3 = new String(charArrar);

        System.out.println(str1 == str2);

        System.out.println(str1 == str3);

        System.out.println(str3 == str2);


    }
}
