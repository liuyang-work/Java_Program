package javastudy.basiccode04.USB;

import javax.swing.*;

/**
 * @author : LiuYang
 * @data 2020-05-15 9:58
 */
public class DemoMain {
    public static void main(String[] args) {

        //创建一个笔记本
        laptop computer = new laptop();

        computer.powerON();

        //装备一个鼠标,供电脑使用

        Mouse mouse = new Mouse();

        //首先向上转型
        USBInterface usbMouse = new Mouse();
        //传递进去USB类型
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        keyboard keyboard = new keyboard();
        //参数是一个USB类型，参数传递的是一个实现类
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
