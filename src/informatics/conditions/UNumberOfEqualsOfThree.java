package informatics.conditions;

import java.util.Scanner;

public class UNumberOfEqualsOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a == b && b == c) {
            System.out.println(3);
        } else if (a == b && b != c || a != b && b == c || a == c && a != b) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}