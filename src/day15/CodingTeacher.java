package day15;

public class CodingTeacher extends Teacher {

    public CodingTeacher(String name) {
        super(name);
    }

    @Override
    public void teachSubject() {
        System.out.println("코딩을 가르치는 " + name);
    }
}
