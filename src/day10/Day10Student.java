package day10;

public class Day10Student {
    public String name;
    public int age;

    public Day10Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce(String gender) {
        return "안녕하세요. 저는 " + age + "살 " + gender + " " + name + "입니다.";
    }
}
