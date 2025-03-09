package day15;

public class Developer extends Employee{

    public Developer(String name) {
        super(name, "개발자");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 코드를 작성합니다.");
    }
}
