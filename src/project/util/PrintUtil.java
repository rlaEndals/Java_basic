package project.util;

import project.Reservation;

public class PrintUtil {

    public void jomusa(Reservation reservation) {
        System.out.println("┌───────────────────────┐\n" +
                "│\t조무사 병원\t\t\t│\n" +
                "├───────────────────────┤\n" +
                "│ 이름 : " + reservation.getUser().getName() + "\t\t\t│\n" +
                "│ 생년월일 : " + reservation.getUser().getBirthday() + "\t│\n" +
                "│ 혈액형 : " + reservation.getUser().getBloodType() + "\t\t\t\t│\n" +
                "├───────────────────────┤\n" +
                "│ 진료과 : " + reservation.getDepartment() + "\t    │\n" +
                "│ 병명 : " + reservation.getDisease()+ "\t\t\t│\n" +
                "├───────────────────────┤\n" +
                "│ 진료비 : " + reservation.getPrice() + "원 \t\t|\n" +
                "│ 결제완료 : " + reservation.getIsPayedString() + "\t\t\t│\n" +
                "└───────────────────────┘");
    }

    public void catholic(Reservation reservation) {
        System.out.println("가톨릭 병원\t\t\n" +
                "--------------------------\n" +
                " 이름 : " + reservation.getUser().getName() +" \n" +
                " 생년월일 : " + reservation.getUser().getBirthday()+ "\n" +
                " 혈액형 : "+ reservation.getUser().getBloodType() +"\n" +
                "----------진료정보-----------\n" +
                " 진료과 : "+reservation.getDepartment()+"\n" +
                " 병명 : "+reservation.getDisease()+"\n" +
                "----------진료비용-----------\n" +
                " 진료비 : " +reservation.getPrice()+ "원\n" +
                " 결제완료 : "+ reservation.getIsPayedString());
    }
    public void coma(Reservation reservation) {
        System.out.println("[coma 병원]\n" +
                "|> 이름 - "+ reservation.getUser().getName()+" |  혈액형 - "+ reservation.getUser().getBloodType()+"\n" +
                "\t|> 생년월일 - "+reservation.getUser().getBirthday()+"\n" +
                "[진료 정보]\n" +
                "|> 진료과 - "+ reservation.getDepartment()+"\n" +
                "|> 병명 - "+ reservation.getDisease()+"\n" +
                "[진료 비용]\n" +
                "|> 진료비 : "+ reservation.getPrice()+"원\n" +
                "|> 결제완료 : "+ reservation.getIsPayedString());
    }

    public void disease() {
        System.out.print("[진료과목]\n" +
                "정형외과 | 골절, 골다공증, 관절질환\n" +
                "내과     | 감기, 천식, 당뇨\n" +
                "피부과   | 아토피, 백반증, 습진\n" +
                ">>> 병명을 입력하세요: ");
    }

}
