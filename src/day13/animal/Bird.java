package day13.animal;

public class Bird extends Animal {

    private int wingSize;

    public Bird(String name, String color, String gender, int wingSize) {
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
