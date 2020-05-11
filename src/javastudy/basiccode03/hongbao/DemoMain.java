package javastudy.basiccode03.hongbao;

import java.util.ArrayList;

/**
 * @author : LiuYang
 * @data 2020-05-11 18:16
 */
public class DemoMain {
    public static void main(String[] args) {
        QunZhu manage = new QunZhu("群主",1000);

        ChenYuan one = new ChenYuan("成员a",0);
        ChenYuan two = new ChenYuan("成员b",0);
        ChenYuan three = new ChenYuan("成员c",0);

        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===================");

        ArrayList<Integer> redList =  manage.send(200, 3);
       //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manage.show();
        one.show();
        two.show();
        three.show();

    }
}
