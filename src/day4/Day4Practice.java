package day4;

import java.util.Scanner;

public class Day4Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.println("세 번째 숫자를 입력하세요: ");
        int num3 = sc.nextInt();
        int maxNum;
        if(num1 > num2 && num1 > num3) {
            maxNum = num1;
        }else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }
        System.out.println("세 수 중 가장 큰 값:" + maxNum);
        int endals = sc.nextInt();

        int weather = (endals % 12) / 3;
        switch (weather) {
            case 0:
                System.out.println("겨울");
                break;
            case 1:
                System.out.println("봄");
                break;
            case 2:
                System.out.println("여름");
                break;
            case 3:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘못된 값입니다.");
        }
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num4 = sc.nextInt();
        System .out.print("연산자를 입력하세요 (+, -, *, /): ");
        char wlsdn = sc.next().charAt(0);
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num5 = sc.nextInt();
        switch (wlsdn) {
            case '+':
                System.out.println(num4 + num5);
                break;
            case '-':
                System.out.println(num4 - num5);
                break;
            case '*':
                System.out.println(num4 * num5);
                break;
            case '/':
                System.out.println(num4 / num5);
                break;
            default:
                System.out.println("잘못된 값입니다.");
        }
    }
}
