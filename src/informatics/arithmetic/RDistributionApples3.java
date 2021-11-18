import java.util.Scanner;

public class RDistributionApples3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int result = (n - k % n) % n;
        System.out.println(result);
    }
}