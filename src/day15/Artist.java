package day15;

public class Artist extends Employee{

    public Artist(String name) {
        super(name, "예술가");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 그림을 그립니다.");
    }
}
