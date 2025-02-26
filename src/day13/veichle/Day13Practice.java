package day13.veichle;

public class Day13Practice {
    public static void main(String[] args) {
        Day13Car car = new Day13Car(50, 10);
        car.move();
        car.refuel(10);

        Day13Bicycle day13Bicycle = new Day13Bicycle(20, "흰색");
        day13Bicycle.move();
        day13Bicycle.pedal();
    }
}
