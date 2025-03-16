package day16;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i=0; i<=8; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int Endals = 1;
        for (int i = 1; i <= 8; i++) {
            if(max < arr[i]) {
                max = arr[i];
                Endals = i + 1;
            }
        }
        System.out.println(max);
        System.out.print(Endals);
    }
}
