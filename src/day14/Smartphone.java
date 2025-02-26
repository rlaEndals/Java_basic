package day14;

public class Smartphone extends ElectronicDevice{
    public Smartphone(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + "이(가) 켜집니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + "이(가) 꺼집니다.");
    }

    public void hello() {
        System.out.println("나는 스마트폰");
    }
}
