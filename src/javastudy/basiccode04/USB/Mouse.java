package javastudy.basiccode04.USB;

/**
 * @author : LiuYang
 * @data 2020-05-15 9:40
 */
public class Mouse implements USBInterface {

    //鼠标是USB设备
    @Override
    public void USBOn() {
        System.out.println("open the Mouse");
    }

    @Override
    public void USBOff() {
        System.out.println("turn off the Mouse");

    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
