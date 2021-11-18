package informatics.conditions;

import java.util.Scanner;

public class ABBarrelsOfOranges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 11 && n <= 14 || n % 100 >= 11 && n % 100 <= 14) {
            System.out.println(n + " bochek");
        } else if (n % 10 == 1) {
            System.out.println(n + " bochka");
        } else if (n % 10 > 1 && n % 10 < 5) {
            System.out.println(n + " bochki");
        } else {
            System.out.println(n + " bochek");
        }
    }
}