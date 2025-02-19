package day13.veichle;

public class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("교통수단이 움직입니다 " + speed + "km/h");
    }
}
