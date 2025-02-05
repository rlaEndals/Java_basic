package day8;

import java.util.Scanner;

public class Day8Practice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] ss = new int[3][3];
        for (int s = 0; s < 3; s++){
            for (int g = 0; g < 3; g++) {
                switch (g) {
                    case 0:
                        System.out.print("학생 " + (s + 1) + "의 국어점수를 입력하세요:");
                        ss[s][g] = sc.nextInt();
                        break;
                    case 1:
                        System.out.print("학생 " + (s + 1) + "의 수학점수를 입력하세요:");
                        ss[s][g] = sc.nextInt();
                        break;
                    case 2:
                        System.out.print("학생 " + (s + 1) + "의 영어점수를 입력하세요:");
                        ss[s][g] = sc.nextInt();
                        break;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ss[i][j] + " ");
            }
            System.out.println();
        }

        for (int s = 0; s < 3; s++) {
            int i = ss[s][0] + ss[s][1] + ss[s][2];
            System.out.print("학생" + (s + 1) + " 의 총점: " + i + " ");
            System.out.print("평균: " + (i / 3.0));
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            int max = ss[i][0];
            int min = ss[i][0];
            for (int j = 0; j < 3; j++) {
                if (max < ss[i][j]){
                    max = ss[i][j];
                } else if (min > ss[i][j]){
                    min = ss[i][j];
                }
            }
            System.out.println("학생" + (i+1) + "의" + "min = " + min);
            System.out.println("학생" + (i+1) + "의" + "max = " + max);
        }

    }
}
