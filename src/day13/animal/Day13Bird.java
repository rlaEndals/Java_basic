package day13.animal;

public class Day13Bird extends Day13Animal {

    private int wingSize;

    public Day13Bird(String name, String color, String gender, int wingSize) {
        super(name, color, gender);
        this.wingSize = wingSize;
    }

    public void fly() {
        System.out.println(getName() + "가 훨훨 납니다");
    }
    public void changeName(String newName) {
        setName(newName);
    }
}
