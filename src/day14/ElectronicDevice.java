package day14;

public class ElectronicDevice {
    private String name;

    public ElectronicDevice(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("모든 기기를 켭니다.");
    }

    public void turnOff() {
        System.out.println("모든 기기를 끕니다.");
    }

    public String getName() {
        return name;
    }
}
