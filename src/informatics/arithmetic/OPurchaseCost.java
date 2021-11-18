import java.util.Scanner;

public class OPurchaseCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        int rub, kop;
        rub = a * n + (b * n) / 100;
        kop = (b * n) % 100;
        System.out.println(rub + " " + kop);
    }
}