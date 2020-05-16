package javastudy.basiccode05.day07;

/**
 * FileName DemoGame
 * Description:
 * Create by liuyang
 * Date 2020/5/16 16:51
 */
public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希射手");  //英雄名称

        //设置英雄技能

      /*  hero.setSkill(new SkillImpl());
        hero.attack();*/

        //还可以使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("pia-pia-pia-pia");
            }
        };
        skill.use();
    }
}
