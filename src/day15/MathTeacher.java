package day15;

public class MathTeacher extends Teacher {

    public MathTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println("수학을 가르치는 " + name);
    }
}
