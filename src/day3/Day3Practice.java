package day3;

import java.util.Scanner;

public class Day3Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1을 입력하세요.:");
        int num1 = sc.nextInt();
        System.out.print("숫자 2를 입력하세요.:");
        int num2 = sc.nextInt();
        System.out.print("숫자 3을 입력하세요.:");
        int num3 = sc.nextInt();
        System.out.println(((double) (num1 + num2 + num3) / 3));
    }
}
