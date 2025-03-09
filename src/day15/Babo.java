package day15;

public class Babo extends Employee{

    public Babo(String name) {
        super(name, "바보");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "은(는) 바보입니다.");
    }
}
