package day13.veichle;

public class Bicycle extends Vehicle {

    private String color;

    public Bicycle(int speed, String color) {
        super(speed);
        this.color = color;
    }

    public void pedal() {
        System.out.println(color + " 자전거를 페달로 밉니다!");
    }
}
