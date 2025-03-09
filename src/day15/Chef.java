package day15;

public class Chef extends  Employee {

    public Chef(String name) {
        super(name, "요리사");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + "이(가) 요리를 합니다.");
    }
}
