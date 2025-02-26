package day14;

public class Day14Animal {
    private String name;

    public Day14Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }

    public void eat() {
        System.out.println(name + "가 먹이를 먹습니다.");
    }

    public String getName() {
        return name;
    }
}
