package javastudy.basiccode03.hongbao;

import java.util.ArrayList;

/**
 * @author : LiuYang
 * @data 2020-05-11 18:16
 */
public class QunZhu extends User {

    public ArrayList<Integer> send(int  totalMoney, int count ){
        //需要一个集合用来存储若干个红包的金额
        ArrayList<Integer> redlist = new ArrayList<>();
        //首先看一下群主有多少钱
        int leftMoney = super.getRestMoney();
        if (totalMoney> leftMoney){
            System.out.println("余额不足");
            return redlist;//返回空集合
        }
        //扣钱
        super.setRestMoney(leftMoney - totalMoney);

        //发红包需要平均分count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;  //余数，也就是零头

        //除不开的放在最后一个红包
        //把红包一个个放在集合中


        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }

        int last = avg + mod;
        redlist.add(last);

        return redlist;


    }

    public QunZhu(){

    }

    public QunZhu(String name, int restMoney) {
        super(name, restMoney);
    }
}
