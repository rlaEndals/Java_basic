package day13.veichle;

public class Car extends Vehicle {

    int fuel;

    public Car(int speed, int fuel) {
        super(speed);
        this.fuel = fuel;
    }

    public void refuel(int amount){
        fuel += amount;
        System.out.println(amount + "연료를 충전해서 총 " + fuel + "L이 되었습니다");
    }
}
