package day13.animal;

public class Day13Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("삐보", "검은색", "여자");
        animal.makeSound();
        animal.moving();

        Bird bird = new Bird("삐뽀", "검은색", "여자", 150);
        bird.setName("김뚱민");
        bird.makeSound();
        bird.moving();
    }
}
