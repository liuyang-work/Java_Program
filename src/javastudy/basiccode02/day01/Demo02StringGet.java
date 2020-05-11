package javastudy.basiccode02.day01;
/*String's methods
1.public int length()  ,get the longth of Strig
2.public String concat(String str)  ,compose a and b;
3.public char charAt(int index),   get the specific address 's char,begin whit 0;
*4.public int indexOf(String str) ,find the char first appears's index,if dont have,return -1

 * */ /*
        *
        * */
public class Demo02StringGet {
    public static void main(String[] args) {

        String str1 = "lkgfdkgjdfoigjogfoigjg";
        int a = str1.length();
        System.out.println("the longth of str1 is:" + a);

        //compose string
        String str2 = "Hello"; //hello
        String str3 = "World";//world

        String str5 = str2.concat(str3);//hello world
        System.out.println(str5);
        System.out.println("=================");


        //get the pointe index  char

        char ch = "Hello".charAt(1);
        System.out.println("the char is:"+ch);
        System.out.println("=============");


        //find the canshu string first appears's index,if dont have,return -1

        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("the first index is :"+index);

        System.out.println("HelloWorld".indexOf("abc"));



    }
}
