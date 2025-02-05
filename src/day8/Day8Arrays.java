package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = {45, 67, 89, 72, 50};
//        System.out.print("50점 이상인 점수: ");
//        for (int score : scores) {
//            if (score >= 50) {
//                System.out.print(score + " ");
//            }
//        }
//        Arrays.sort(scores);
//        System.out.println("정렬된 정수: " + Arrays.toString(scores));
//        for (int score : scores) {
//            System.out.println("점수: " + score);
//        }
//        for (int i = 0; i < scores.length / 2; i++) {
//            int temp = scores[i];
//            scores[i] = scores[scores.length - i -1];
//            scores[scores.length - i - 1] = temp;
//        }
//        System.out.println("내림차순 정렬 = " + Arrays.toString(scores));
//        int[][] ss = new int[3][4];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                ss[i][j] = i+j;
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(ss[i][j]);
//            }
//            System.out.println();
//        }
        int[][] studentScores = {
                {85, 90, 92}, //학생1
                {78, 88, 80}, //학생2
                {90, 94, 99}, //학생3
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(studentScores[i][j] + " ");
            }
            System.out.println();
        }
    }
}