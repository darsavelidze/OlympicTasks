package informatics.arithmetic;

import java.util.Scanner;

public class NEndOfLessons {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), odd, even, minutes;
        odd = n / 2;
        even = (n - 1) / 2;
        minutes = 60 * 9 + n * 45 + odd * 5 + even * 15;
        System.out.println(minutes / 60 + " " + minutes % 60);
    }
}