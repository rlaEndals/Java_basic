package day13.veichle;

public class Day13Practice {
    public static void main(String[] args) {
        Car car = new Car(50, 10);
        car.move();
        car.refuel(10);

        Bicycle bicycle = new Bicycle(20, "흰색");
        bicycle.move();
        bicycle.pedal();
    }
}
