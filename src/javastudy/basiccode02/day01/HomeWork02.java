package javastudy.basiccode02.day01;
//sum the different string element
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("please input a string:");
        String a = temp.next();
        System.out.println("==============");
        //get the string every letter

        int n = a.length();
        int maxLetter=0,minLetter=0,Number=0,others=0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i)>=65&a.charAt(i)<=89){
                maxLetter += 1;continue;
            }
            else if(a.charAt(i)>=97&a.charAt(i)<=129){
                minLetter += 1;continue;
            }
            else if(a.charAt(i)>=48&a.charAt(i)<=57){
                Number +=1;continue;
            }
            else {
                others += 1;
            }


        }

        System.out.println("maxLetter:"+maxLetter);
        System.out.println("minLetter:"+minLetter);
        System.out.println("Number:"+Number);
        System.out.println("others:"+others);


    }
}
