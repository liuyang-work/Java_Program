package javastudy.basiccode02.day01;

//compose the string ,eg.[word1#word2#word3]
public class HomeWork01 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4};

        System.out.println("==============");

     //   System.out.print("[");
       // System.out.print(hk(str1,str2,str3));
        //System.out.print("]");

        System.out.print(convent01(a));

    /*    String result = (str1.concat(middle).concat(str2)).concat(middle).concat(str3);
        System.out.print("[");
        System.out.print(result);
        System.out.print("]"); */

    }
    public  static String convent01(int[] a){
        String str = "[";
        for (int i = 0; i < a.length; i++) {
        if(i==a.length-1){
            str +="word"+ a[i]+"]";
        }
        else{
            str += "word" + a[i]+"#";
        }


    }


    /*public static String hk(String x, String y,String z){

        return x.concat("#").concat(y).concat("#").concat(z);*/

        return str;
    }
}
