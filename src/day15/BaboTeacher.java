package day15;

public class BaboTeacher extends Teacher{

    public BaboTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println("바보 선생님인 " + name);
    }
}
