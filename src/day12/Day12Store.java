package day12;

import java.util.Scanner;

public class Day12Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day12Payment woqkdh = new Day12Payment();
        System.out.println("두 정수의 합:" + woqkdh.add(3, 5));
        System.out.println("세 정수의 합:" + woqkdh.add(3, 5, 7));
        System.out.println("두 실수의 합:" + woqkdh.add(3.5, 5));
        System.out.print("연필(1500원) 몇 개를 구매할까요?");
        int rlaEndals = sc.nextInt();
        System.out.println("연필 총액:" + woqkdh.rkrur(rlaEndals));
    }
}
