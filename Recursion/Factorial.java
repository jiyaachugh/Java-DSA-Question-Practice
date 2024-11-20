import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        if(n < 0) {
            System.out.println("inavlid number");
        }
        int pdt = 1;
        for (int i = 1; i <= n; i++) {
            pdt = pdt * i;
        }
        return pdt;
    }

    public static int factR(int n) {
        if(n == 1) {
            return n;
        }
        int temp = factR(n-1);
        return n * temp;
    }
}
