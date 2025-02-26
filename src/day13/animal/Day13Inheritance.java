package day13.animal;

public class Day13Inheritance {
    public static void main(String[] args) {
        Day13Animal animal = new Day13Animal("삐보", "검은색", "여자");
        animal.makeSound();
        animal.moving();

        Day13Bird day13Bird = new Day13Bird("삐뽀", "검은색", "여자", 150);
        day13Bird.setName("김뚱민");
        day13Bird.makeSound();
        day13Bird.moving();
    }
}
