package day16;

public class Day16Interface {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Swimmable fish = new Fish();
        Duck duck = new Duck();

        bird.fly();
        fish.swim();
        duck.fly();
        duck.swim();
    }
}
