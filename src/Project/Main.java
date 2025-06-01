package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hospital[] hospitals = new Hospital[3];

        hospitals[0] = new Hospital("가톨릭 병원", "서울");
        hospitals[1] = new Hospital("coma 병원", "수원");
        hospitals[2] = new Hospital("조무사 병원", "부천");

        int select = 0;
        while (true) {
            System.out.println("무엇을 하러 오셨나요? \n1.예약하기\n2.조회하기\n3.끝내기");
            System.out.print(">>> ");
            select = sc.nextInt();

            if (select == 1) {
                
            } else if (select == 2) {
                
            } else if (select == 3) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
