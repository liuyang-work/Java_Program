package liuyang.javastudy.day07;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : LiuYang
 * @data 2020-04-27 21:20
 */
/*
* 用一个大集合装20个随机数，让后筛选出偶数，放入一个小集合中
* 定义方法去实现
* 暂定随机数在1-100间
* */
public class HomeWork04 {
    public static void main(String[] args) {

        //创建两个集合对象


        ArrayList<Integer> list1 = gainNumber();
        System.out.println(list1);
        ArrayList<Integer> list2 = chooseOuShu(list1);

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)+",");
        }


        //创建随机函数对象



    }

    //方法一，获取随机数
    public static ArrayList<Integer> gainNumber(){
        ArrayList<Integer> list  = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);

        }
        return list;
    }

    //方法二，筛选偶数
    public static ArrayList<Integer> chooseOuShu(ArrayList<Integer> x){
        ArrayList<Integer> temp =new ArrayList<>();

        for (int i = 0; i < x.size(); i++) {  //遍历随机数集合

            if (x.get(i)%2==0){          //筛选偶数
                temp.add(x.get(i));
            }
        }

        return temp;
    }
}
