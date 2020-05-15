package javastudy.basiccode04.USB;

import javax.swing.*;

/**
 * @author : LiuYang
 * @data 2020-05-15 9:39
 */
public class laptop {

    public void useDevice(USBInterface usb) {
        usb.USBOn();  //open the device
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof keyboard){
            keyboard keyboard = (keyboard)usb;
            keyboard.hit();
        }

        usb.USBOff();  //close the device
    }
   public void powerON(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }

}
