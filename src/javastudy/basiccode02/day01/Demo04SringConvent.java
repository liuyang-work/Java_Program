package javastudy.basiccode02.day01;


/*
* public char[] toCharArray(); //将当前字符串拆分成字节数组作为返回值
* public byte[] getBytes(); //get the sting's byte,and reutrn byte[]
* public string replace(charsequence oldstring,charsequence newstring);  use the new string convent the the old string
* */
public class Demo04SringConvent {
    public static void main(String[] args) {
        String str1 ="heloworld";
        char[] chars =str1.toCharArray();
        System.out.println(chars);
        System.out.println(chars[0] );
        System.out.println(chars.length);


        System.out.println("=============");
        byte[] bytes=str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("============");
        
        String str2 = "How do you do";
        String str3 = str2.replace("o","*" );
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=================");


        String lang1 = "you can?fuck";
        String lang2 = lang1.replace("fuck", "****");
        System.out.println(lang2);
    }
}
