package javastudy.faceobject.day03;

import java.lang.reflect.Array;
import java.util.Arrays;

//Arrsys 是一个与数组相关的工具类，有大量静态方法
//public static String toString(数组) ,将 数组变成字符串（默认形式[元素1，元素2，元素3...]）
//publbic static void sort(array),按照默认从小到大对数组进行排序

public class Demo011Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String instr = Arrays.toString(intArray);
        System.out.println(instr);

        System.out.println("=======================");
        int[] array1 = {2,5,66,876,23,52,1,5,4};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
