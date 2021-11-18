package informatics.conditions;

import java.util.Scanner;

public class QIceCream {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if (k == 3 || k == 5 || k == 6 || k >= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}