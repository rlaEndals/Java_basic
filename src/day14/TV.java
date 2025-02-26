package day14;

public class TV extends ElectronicDevice {
    public TV(String name) {
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
}
