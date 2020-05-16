package javastudy.basiccode05.day07;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName DemoInterface
 * Description:
 * Create by liuyang
 * Date 2020/5/16 17:05
 */
public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


    }

    public static List<String> addName(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛雅咋啊");
        list.add("撒有哪啦");
        return list;
    }
}
