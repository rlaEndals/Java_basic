package day14;

public class Day14Practice {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("갤럭시폰");
        Laptop laptop = new Laptop("애플노트북");
        TV tv = new TV("삼성TV");

        ElectronicDevice[] electronicDevices = {smartphone, laptop, tv};
        for (ElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.turnOn();
            electronicDevice.turnOff();
        }
//        System.out.println("모든 기기를 켭니다.");
//        smartphone.turnOn();
//        laptop.turnOn();
//        tv.turnOn();
//        System.out.println();
//
//        System.out.println("모든 기기를 끕니다.");
//        smartphone.turnOff();
//        laptop.turnOff();
//        tv.turnOff();
    }
}
