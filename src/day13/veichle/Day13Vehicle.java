package day13.veichle;

public class Day13Vehicle {
    protected int speed;

    public Day13Vehicle(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("교통수단이 움직입니다 " + speed + "km/h");
    }
}
