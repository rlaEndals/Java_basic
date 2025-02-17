package day11;

import java.util.Scanner;

public class Day11CapsurePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Day11User user1 = new Day11User();
        System.out.print("아이디를 입력하세요:");
        String id = sc.next();
        System.out.print("비밀번호를 입력하세요:");
        String password = sc.next();
        user1.setId(id);
        boolean success = user1.setPassword(password);
        if (success == true) {
            System.out.println(user1.getId());
            System.out.println(user1.getPassword());
            System.out.println("으로 가입되었습니다.");
        } else {
            System.out.println("가입 실패");
            return;
        }
        System.out.println("비밀번호 변경을 시작합니다.\n로그인 후 진행됩니다.");
        System.out.print("아이디를 입력하세요:");
        String id2 = sc.next();
        if (user1.getId().equals(id2)){
            System.out.print("비밀번호를 입력하세요:");
            String password2 = sc.next();
            if (user1.getPassword().equals(password2)) {
                System.out.println("로그인성공");
                System.out.print("새로운 비밀번호를 입력하세요:");
                String newpassword = sc.next();
                user1.setPassword(newpassword);
                System.out.println("[변경 성공] 비밀번호 변경에 성공하였습니다.");
            }
        } else {
            System.out.println("로그인 실패");
            return;
        }


    }
}
