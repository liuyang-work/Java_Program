package javastudy.basiccode03.day02;

/**
 * @author : LiuYang
 * @data 2020-05-10 15:40
 */
public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
