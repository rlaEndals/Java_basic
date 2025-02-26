package day13.veichle;

public class Day13Bicycle extends Day13Vehicle {

    private String color;

    public Day13Bicycle(int speed, String color) {
        super(speed);
        this.color = color;
    }

    public void pedal() {
        System.out.println(color + " 자전거를 페달로 밉니다!");
    }
}
