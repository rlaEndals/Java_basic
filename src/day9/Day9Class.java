package day9;

public class Day9Class {
    public static void main(String[] args) {
        Day9Dog day9Dog1 = new Day9Dog();
        day9Dog1.name = "김율";
        day9Dog1.age = 2;

        System.out.println("강아지 이를 = " + day9Dog1.name);
        System.out.println("강아지 나이 = " + day9Dog1.age);

        Day9Dog day9Dog2 = day9Dog1;
        day9Dog2.name = "뽀삐";
        day9Dog2.age = 4;

        System.out.println("강아지 이를 = " + day9Dog2.name);
        System.out.println("강아지 나이 = " + day9Dog2.age);
    }
}