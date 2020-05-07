public class Demo01String {
    //创建字符串的3+1种方式
    /*3种构造方，一种直接创建
     *public String(),创建一个空白字符串，不含有内容
     * public String(char []  array) 根据字符数组的内容，来创建字符串
     * pblic String(byte[] array) 根据字节数组，
     * */
    public static void main(String[] args) {
        //use nothing canshu
        String str1 = new String();
        System.out.println("the first stings:"+str1);

        //use char array
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("the second strign:" + str2);

        //use byte set up string
        byte[] bytesArray = {97,98,99};
        String str3 = new String(bytesArray);
        System.out.println("the third string:"+str3);

        //go ahead

        String str4 = "Hello";
        System.out.println("the forth string:"+str4);


    }

}
