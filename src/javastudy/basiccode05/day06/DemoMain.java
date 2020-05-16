package javastudy.basiccode05.day06;

/**
 * FileName DemoMain
 * Description:
 * Create by liuyang
 * Date 2020/5/16 16:29
 */
public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        Weapon weapon = new Weapon("多兰剑");
        hero.setWeapon(weapon);
        hero.attack();

    }
}
