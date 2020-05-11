package javastudy.basiccode03.hongbao;

/**
 * @author : LiuYang
 * @data 2020-05-11 18:15
 */
public class User {
    private String name; //姓名
    private int restMoney; //余额

    public void show(){
        System.out.println("我叫："+name+",我有多少钱："+restMoney);
    }

    public User() {
    }

    public User(String name, int restMoney) {
        this.name = name;
        this.restMoney = restMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRestMoney() {
        return restMoney;
    }

    public void setRestMoney(int restMoney) {
        this.restMoney = restMoney;
    }
}
