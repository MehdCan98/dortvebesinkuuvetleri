import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Değer Yazınız: ");
        n = input.nextInt();

        for (int i = 1; i <=n; i *= 5) {
            System.out.print(i+" ");
        }

        for (int c = 1; c <=n; c *= 4) {
            System.out.print(c+"  ");
        }

    }
}