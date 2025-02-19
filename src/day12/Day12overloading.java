package day12;

public class Day12overloading {
    public static void main(String[] args) {
        Day12Calculater wlsEhdgnl = new Day12Calculater();
        System.out.println("두 정수의 합:" + wlsEhdgnl.add(3, 5));
        System.out.println("세 정수의 합:" + wlsEhdgnl.add(3, 5, 7));
        System.out.println("두 실수의 합:" + wlsEhdgnl.add(3.5, 5.2));
    }
}
