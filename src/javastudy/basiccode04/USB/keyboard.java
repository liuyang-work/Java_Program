package javastudy.basiccode04.USB;

/**
 * @author : LiuYang
 * @data 2020-05-15 9:40
 */

//键盘是USB设备
public class keyboard implements USBInterface {
    @Override
    public void USBOn() {
        System.out.println("open the keyboard");
    }

    @Override
    public void USBOff() {
        System.out.println("turn off the keyboard");
    }

    public void hit(){
        System.out.println("键盘敲击");
    }
}
