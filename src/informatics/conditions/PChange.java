package informatics.conditions;

import java.util.Scanner;

public class PChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        int first = a * 100 + b;
        int second = c * 100 + d;
        int e = (second - first) / 100;
        int f = (second - first) % 100;
        System.out.println(e + " " + f);
    }
}