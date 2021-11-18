package informatics.conditions;

import java.util.Scanner;

public class YMetroTickets1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), n1 = n % 10, n10 = (n % 60) / 10, n60 = n / 60;
        if (n1 * 15 > 125) {
            n1 = 0;
            n10++;
        }
        if (n1 * 15 + n10 * 125 > 440) {
            n1 = 0;
            n10 = 0;
            n60++;
        }
        System.out.println(n1 + " " + n10 + " " + n60);
    }
}