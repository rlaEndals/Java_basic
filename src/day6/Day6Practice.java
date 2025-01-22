package day6;

import java.util.Scanner;

public class Day6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1번 문제
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                continue;
            }
        }
        // 2번 문제
        int sum = 0;
        System.out.print("숫자를 입력하세요.");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
            if (sum >= 50) {
                System.out.println("합계가 50을 넘었습니다. 반복 종료!");
                break;
            }
            System.out.println("현재 합계: " + sum);
        }
        System.out.println("최종 합계: " + sum);
        //3번 문제
        System.out.print("삼각형의 높이를 입력하세요: ");
        int Endals = sc.nextInt();
        for (int i  = 1; i <= Endals; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //4번 문제
        for (int i  = 1; i <= Endals; i++) {
            for (int j = 1; j <= Endals - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
