package day10;

import day9.Day9Dog;

public class Day10method {
    //
    public static void main(String[] args) {
//        int result = add(3, 5);
//        System.out.println("result = " + result);

        Day10Cat cat1 = new Day10Cat();
        cat1.name = "진동휘";
        cat1.age = 14;
        System.out.println(cat1.introduce());

        Day10Cat catOnlyName = new Day10Cat("진동휘");
        catOnlyName.age = 14;

        Day10Cat catOnlyAge = new Day10Cat(14);
        catOnlyAge.name = "진동휘";

        Day10Cat catAll = new Day10Cat("진동휘", 14);
    }



    //
//    public static int add(int a, int b) {
//        return a+b;
//    }
}
