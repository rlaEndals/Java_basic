package project;

import project.util.PrintUtil;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintUtil printUtil = new PrintUtil();

        Hospital[] hospitals = new Hospital[3];

        hospitals[0] = new Hospital("가톨릭 병원", "서울");
        hospitals[1] = new Hospital("coma 병원", "수원");
        hospitals[2] = new Hospital("조무사 병원", "안산");

        int select = 0;
        while (true) {
            System.out.println("무엇을 하러 오셨나요? \n1.예약하기\n2.조회하기\n3.끝내기");
            System.out.print(">>> ");
            select = sc.nextInt();

            if (select == 1) {
                Reservation reservation = new Reservation();
                User user = new User();

                printUtil.hospital();

                int hos = sc.nextInt();

                System.out.print("이름을 입력하세요: ");
                user.setName(sc.next());

                System.out.print("생년월일을 입력하세요: ");
                user.setBirthday(sc.next());

                System.out.print("혈액형을 입력하세요: ");
                user.setBloodType(sc.next());

                reservation.setUser(user);

                printUtil.disease();
                String disease = sc.next();

                reservation.setDisease(disease);

                switch (disease) {
                    case "골절", "골다공증", "관절질환":
                        reservation.setDepartment("정형외과");
                        break;
                    case "감기", "천식", "당뇨":
                        reservation.setDepartment("내과    ");
                        break;
                    case "아토피", "백반증", "습진":
                        reservation.setDepartment("피부과  ");
                        break;
                }

                int price = hospitals[hos - 1].calculatePrice(user.getAge(), reservation.getDepartment());
                reservation.setPrice(price);

                System.out.print("1. 지금 결제하시겠습니까?\n2. 나중에 결제하시겠습니까?\n>>> ");
                int payed = sc.nextInt();

                reservation.setPayed(payed == 1 ? true : false);
                hospitals[hos - 1].addReservation(reservation);
                System.out.println("!!!예약되었습니다!!!");

                switch (hos) {
                    case 1:
                        printUtil.catholic(reservation);
                        break;
                    case 2:
                        printUtil.coma(reservation);
                        break;
                    case 3:
                        printUtil.jomusa(reservation);
                        break;
                }

            } else if (select == 2) {
                System.out.print("이름을 입력하세요: ");
                String name = sc.next();

                System.out.print("생년월일을 입력하세요: ");
                String birthday = sc.next();
                for (int i = 0; i < 3; i++) {
                    List<Reservation> reservations =  hospitals[i].getReservations();
                    for (Reservation reservation : reservations) {
                        if (reservation.getUser().getName().equals(name) && reservation.getUser().getBirthday().equals(birthday)){
                            switch (i+1) {
                                case 1:
                                    printUtil.catholic(reservation);
                                    break;
                                case 2:
                                    printUtil.coma(reservation);
                                    break;
                                case 3:
                                    printUtil.jomusa(reservation);
                                    break;
                            }
                        }
                    }
                }

            } else if (select == 3) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
