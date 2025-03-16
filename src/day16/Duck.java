package day16;

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("오리가 하늘을 납니다.");
    }

    @Override
    public void swim() {
        System.out.println("오리가 물속을 헤엄칩니다.");
    }
}
