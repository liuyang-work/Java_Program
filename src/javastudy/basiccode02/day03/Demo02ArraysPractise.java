package javastudy.basiccode02.day03;

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "dsggkregklgjrioggerekg";
        char[] array1 = str.toCharArray();
        Arrays.sort(array1);

        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);
        }











    }}
