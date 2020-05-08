package liuyang.javastudy.day07;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : LiuYang
 * @data 2020-04-27 20:43
 */
//随机生成6个1~33范围内的数，并且添加到集合，遍历集合
    //随机数类Random，集合类ArrayList
    //整体加1,，控制范围为1-33，

public class HomeWork01 {
    public static void main(String[] args) {

        Random r = new Random();


        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < 6; i++) {

            list.add(r.nextInt(33)+1);   //生成随机数，在整体加1，别忘记参数，
            System.out.println(list);
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }


    }

}
