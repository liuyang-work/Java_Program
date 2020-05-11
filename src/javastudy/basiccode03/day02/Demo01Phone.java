package javastudy.basiccode03.day02;

import java.security.PublicKey;

/**
 * @author : LiuYang
 * @data 2020-05-10 15:42
 */
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=======================");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
