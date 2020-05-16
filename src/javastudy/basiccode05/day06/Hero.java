package javastudy.basiccode05.day06;

/**
 * FileName Hero
 * Description:
 * Create by liuyang
 * Date 2020/5/16 16:24
 */

//游戏中的英雄角色类
public class Hero {

    private String name;   //英雄名字
    private Weapon weapon; //英雄的武器
    private int age; //英雄的年龄


    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"用"+weapon.getCode()+"攻击敌方");
    }

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
