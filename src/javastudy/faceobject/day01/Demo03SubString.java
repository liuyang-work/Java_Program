package javastudy.faceobject.day01;

import java.util.SortedMap;

/*
 * public String substring(int index） ,cut begin the index to the end
 * public String sunstring (int begin,int end) ,cut bengin index to en index
 */
public class Demo03SubString {
    public static void main(String[] args) {

        String str1 ="HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);
        System.out.println(str1);

        System.out.println("===========");

        String str3 = str1.substring(1, 3);
        System.out.println(str3);
        System.out.println("============");
        //the string can't be change
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java
    }
}
