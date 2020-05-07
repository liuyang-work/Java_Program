package javastudy.faceobject.day03;

public class Demo04MathPractise {
    public static void main(String[] args) {
        int count=0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int)min;i < max;i++){
            int abs=Math.abs(i);
            if (abs>6 || abs<2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("=====================");
        System.out.println(count);
    }
}
