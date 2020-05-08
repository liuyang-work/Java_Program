package javastudy.faceobject.day06;

public class Zi extends Fu {
    int num =20;

    public void method(){
        int num = 30; //30
        System.out.println(num);

        System.out.println(this.num); //20

        System.out.println(super.num); //10
    }
}