package day2;

import java.sql.SQLOutput;

public class Day2variable {
    public static void main(String[] args) {
        byte number1 = 127;
        short number2 = 32767;
        int number3 = 2147483647;
        long number4 = 9223372036854775807L;
        float number5 = 4.5F;
        double number6 = 5.5;

        System.out.println("byte = " + number1);
        System.out.println("short = " + number2);
        System.out.println("int = " + (number3 + 1));
        System.out.println("long = " + number4);
        System.out.println("float = " + number5);
        System.out.println("double = " + number6);

        char character = 'a';
        String s ="안녕하세요";

        System.out.println("character = " + character);
        System.out.println("String = " + s);

        boolean flag = true;
        System.out.println("boolean = " + flag);

        int var;
        var = 2;
        System.out.println("var = " + var);
    }
}
