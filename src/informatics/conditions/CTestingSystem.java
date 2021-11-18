package informatics.conditions;

import java.util.Scanner;

public class CTestingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        if (a == 1 && b == 1) {
            System.out.println("YES");
        } else if (a != 1 && b != 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}