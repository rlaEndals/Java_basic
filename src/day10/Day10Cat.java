package day10;

public class Day10Cat {
    public String name;
    public int age;

    public Day10Cat() {
    }

    public Day10Cat(String name) {
        this.name = name;
    }

    public Day10Cat(int age) {
        this.age = age;
    }

    public Day10Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "나의 이름은 " + name + " 멍청이죠\n나의 나이는 " + age + "살 잼민이죠";
    }
}
