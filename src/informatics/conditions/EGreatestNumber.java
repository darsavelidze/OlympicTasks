package informatics.conditions;

import java.util.Scanner;

public class EGreatestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if (a > b) {
            System.out.println(1);
        } else if (a < b) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}