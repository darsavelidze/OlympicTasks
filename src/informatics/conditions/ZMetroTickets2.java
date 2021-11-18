package informatics.conditions;

import java.util.Scanner;

public class ZMetroTickets2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), n1 = n % 5, n2 = (n % 10) / 5, n3 = (n % 20) / 10, n4 = (n % 60) / 20, n5 = n / 60;
        if (n1 * 15 + n2 * 70 >= 125) {
            n1 = 0;
            n2 = 0;
            n3++;
        }
        if (n1 * 15 + n2 * 70 + n3 * 125 >= 230) {
            n1 = 0;
            n2 = 0;
            n3 = 0;
            n4++;
        }
        if (n1 * 15 + n2 * 70 + n3 * 125 + n4 * 230 >= 440) {
            n1 = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5++;
        }
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
    }
}