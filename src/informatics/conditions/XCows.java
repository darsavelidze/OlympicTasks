package informatics.conditions;

import java.util.Scanner;

public class XCows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 11 && n <= 14) {
            System.out.println(n + " korov");
        } else if (n % 10 == 1) {
            System.out.println(n + " korova");
        } else if (n % 10 >= 2 && n % 10 <= 4) {
            System.out.println(n + " korovy");
        } else {
            System.out.println(n + " korov");
        }
    }
}