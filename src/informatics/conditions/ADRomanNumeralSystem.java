package informatics.conditions;

import java.util.Scanner;

public class ADRomanNumeralSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String num[] = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        if (N <= 10) {
            System.out.println(num[N]);
        } else if (N == 100) {
            System.out.println(num[19]);
        } else {
            System.out.println(num[9 + N / 10] + num[N % 10]);
        }
    }
}