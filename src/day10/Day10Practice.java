package day10;

import java.util.Scanner;

public class Day10Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Day10Student student1 = new Day10Student("승환", 25);
//        Day10Student student2 = new Day10Student("민수", 18);
//        Day10Student student3 = new Day10Student("영희", 15);
//        System.out.println(student1.introduce());
//        System.out.println(student2.introduce());
//        System.out.println(student3.introduce());
//
//        Day10Student[] students = {student1, student2, student3};
//        for (Day10Student student : students) {
//            System.out.println(student.introduce());
//        }

        Day10Student[] students = new Day10Student[3];

        for (int i =1; i<=3; i++){
            System.out.print("학생 " + i + "이름을 입력하세요:");
            String name = sc.next();
            System.out.print("학생 " + i + "나이를 입력하세요:");
            int age = sc.nextInt();

            Day10Student student = new Day10Student(name, age);
            students[i - 1] = student;
        }
        //
        for (Day10Student student : students) {
            System.out.println(student.introduce());
        }
    }
}
