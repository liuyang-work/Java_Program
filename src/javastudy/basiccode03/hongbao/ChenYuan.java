package javastudy.basiccode03.hongbao;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : LiuYang
 * @data 2020-05-11 18:16
 */
public class ChenYuan extends User {
    public ChenYuan(){

    }

    public ChenYuan(String name, int restMoney) {
        super(name, restMoney);
    }

    public void receive(ArrayList<Integer> list ){
        //从多个红包中随便取一个给自己
        //随机获得一个索引
        int index = new Random().nextInt(list.size());
        //根据索引，从集合中删除，并且得到被删除的红包给自己
        int delta = list.remove(index);
        //当前成员自己本来的钱
        int money = super.getRestMoney();
        //并且从新设置回去
        super.setRestMoney(money + delta);

    }
}
