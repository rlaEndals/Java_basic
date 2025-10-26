package bonus;

import java.util.Scanner;

public class Bonus9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String[] s = new String[4];
        for (int i = 0; i < t; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < t; i++) {
            char a = s[i].charAt(0);
            char b = s[i].charAt(s[i].length() - 1);

            System.out.println("" + a + b);
        }
    }
}
