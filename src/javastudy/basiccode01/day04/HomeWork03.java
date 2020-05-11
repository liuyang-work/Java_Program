package liuyang.javastudy.day07;

import java.util.ArrayList;

/**
 * @author : LiuYang
 * @data 2020-04-27 21:07
 */

/*
* 以指定格式打印集合{元素@元素@元素。。。}
* */
public class HomeWork03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        //调用方法，传递list
        printfArrayList(list);

    }


    public static void printfArrayList(ArrayList<Integer> x){
        System.out.print("{");
        for (int i = 0; i < x.size(); i++) {

            System.out.print(x.get(i));
            if ((i+1)==x.size()){

            }
            else {
                System.out.print("@");
            }


        }
        System.out.println("}");
    }
}
