package day9;

public class Day9Practice {
    public static void main(String[] args) {
        Day9Car car1 = new Day9Car();
        car1.name = "벤츠";
        car1.species = "승용차";
        car1.color = "빨간색";
        System.out.println("자동차 이름 = " + car1.name);
        System.out.println("자동차 종 = " + car1.species);
        System.out.println("자동차 색깔 = " + car1.color);
        car1.jajun();
        car1.horn();


        Day9Car car2 = new Day9Car();
        car2.name = "기아";
        car2.species = "승용차";
        car2.color = "흰색";
        System.out.println("자동차 이름 = " + car2.name);
        System.out.println("자동차 종 = " + car2.species);
        System.out.println("자동차 색깔 = " + car2.color);
        car2.jajun();
        car2.horn();

        Day9Car car3 = new Day9Car();
        car3.name = "현대";
        car3.species = "승용차";
        car3.color = "검은색";
        System.out.println("자동차 이름 = " + car3.name);
        System.out.println("자동차 종 = " + car3.species);
        System.out.println("자동차 색깔 = " + car3.color);
        car3.jajun();
        car3.horn();
    }
}
