package day14;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int Endals = sc.nextInt();
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
        for (int i = Endals -1; i >= 1; i--) {
            for (int j = 1; j <= Endals - i; j++){
                System.out.print(" ");
            }

            for (int j = (2 * i - 1); j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
