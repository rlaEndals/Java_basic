package day5;

import java.util.Scanner;

public class Day5Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("i = " + i);
//        }
//        int count = 1;
//        while (count <= 10) {
//            System.out.println("count = " + count++);
//        }
//        for (int i =1; i <= 10; i +=2) {
//            System.out.println("i = " + i);
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                System.out.println("i = " + i);
//            }
//        }

        int num = 0;
        while (true) {
            System.out.print("출력할 단을 입력하세요(2~9): ");
            num = sc.nextInt();
            if (num < 2 || num > 9) {
                System.out.println("2에서 9 사이로 입력하세요!");
                continue;
            }
            for (int i = 9; i > 0; i--) {
                System.out.println(num + " * " + i + " = "  + (num * i));
            }
            break;
        }
    }
}