package day15;

public class Doctor extends Employee {

    public Doctor(String name) {
        super(name, "의사");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 환자를 진료합니다.");
    }
}
