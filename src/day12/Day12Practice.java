package day12;

import java.util.Scanner;

public class Day12Practice {
    public static void main(String[] args) {
//        Day12ShapeCalculator rnWlsn = new Day12ShapeCalculator();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정사각형의 변의 길이:");
//        int i = sc.nextInt();
//        System.out.println("정사각형의 면적" + rnWlsn.calculate(i));
//        System.out.print("직사각형의 가로 길이:");
//        int s = sc.nextInt();
//        System.out.print("직사각형의 세로길이:");
//        int d = sc.nextInt();
//        System.out.println("직사각형의 면적" + rnWlsn.calculate(s, d));
//        System.out.print("원의 반지름의 길이:");
//        double r = sc.nextDouble();
//        System.out.println("원의 면적" + rnWlsn.calculate(r));

        Scanner sc = new Scanner(System.in);

        Day12Book[] books = new Day12Book[3];

        books[0] = new Day12Book("해리포텅", "구진우", false);
        books[1] = new Day12Book("반지의 여왕", "천승환", false);
        books[2] = new Day12Book("어밴져스", "김뚱민", false);

        System.out.print("빌릴 책 번호를 입력하세요:");
        int i = sc.nextInt();
        if (i > 2 || i < 0){
            System.out.println("그책은 없습니다.");
            return;
        }
        books[i].rentBook();

        for (Day12Book book : books) {
            String s = book.isRented() ? "대여중" : "대여 가능";
            System.out.println("제목:" + book.getTitle() + ", 대여 상태:" + s);
            //진루 로러ㅏ롸로라ㅗㄹ
        }
    }
}
