package informatics.arithmetic;

import java.util.Scanner;

public class MExchangeOfValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c;
        c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}