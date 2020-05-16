package javastudy.basiccode05.day03;

import java.sql.SQLOutput;

/**
 * @author : LiuYang
 * @data 2020-05-16 9:51
 */
public class Body {


    public class Heart{

        //内部类方法
        public void beat(){
            System.out.println("心脏跳动");



            System.out.println("我叫"+name);

        }
    }

    private String name;

    //外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");


        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
