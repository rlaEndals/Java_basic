package day2;

import java.util.Scanner;

public class Day2practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          System.out.print("출생연도를 입력하세요:");
          int i = sc.nextInt();
          System.out.println("당신의 나이는 " +(2025 - i)+ "입니다");

          System.out.print("사각형의 가로 길이를 입력하세요:");
          double d = sc.nextDouble();
          System.out.print("사각형의 세로 길이를 입력하세요:");
          double d2 = sc.nextDouble();
          System.out.println("사각형의 넓이는 " +(d*d2) +"입니다.");

          System.out.print("첫 번째 숫자를 입력하세요:");
          double d3 = sc.nextDouble();
          System.out.print("두 번째 숫자를 입력하세요:");
          double d4 = sc.nextDouble();
          System.out.println(d3 + " + " + d4 + " = " + (d3 + d4));
          System.out.println(d3 + " - " + d4 + " = " + (d3 - d4));
          System.out.println(d3 + " * " + d4 + " = " + (d3 * d4));
          System.out.println(d3 + " / " + d4 + " = " + (d3 / d4));
          System.out.println(d3 + " % " + d4 + " = " + (d3 % d4));

          System.out.println("자기 소개를 시작합니다! 정보를 입력해주세요.");
          System.out.print("이름을 입력하세요:");
          String s = sc.next();
          System.out.print("나이를 입력하세요:");
          int i3 = sc.nextInt();
          System.out.print("성별을 입력하세요:");
          String s2 = sc.next();
          System.out.println("제 이름은 " + s + "이고 " + i3 + "살 " + s2 + "입니다.");

    }
}
