package informatics.conditions;

import java.util.Scanner;

public class ACEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
        if ((A % 2 == 0 || B % 2 == 0 || C % 2 == 0) && (A % 2 == 1 || B % 2 == 1 || C % 2 == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}