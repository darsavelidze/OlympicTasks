package informatics.conditions;

import java.util.Scanner;

public class AMaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
//        System.out.println(Math.max(a, b));
    }
}