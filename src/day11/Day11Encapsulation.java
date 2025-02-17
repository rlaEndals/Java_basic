package day11;

public class Day11Encapsulation {
//    public static void main(String[] args) {
//        wowns();
//    }
//    public static void wowns() {
//        System.out.println("째준 바보 바보 바보 바보 바보 바보");
//    }
//}

    public static void main(String[] args) {
        Day11Field example = new Day11Field();

        example.a = "1";

        example.getPrivateField();

        System.out.println(example.publicField);
        System.out.println(example.getPrivateField());

        example.setPrivateField("새로운 값");
        System.out.println(example.getPrivateField());
    }
}

