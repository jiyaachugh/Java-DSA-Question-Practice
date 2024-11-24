import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = inp.nextInt();
        System.out.println(fibRec(n));
    }

    public static int fib(int n) {
        int n1 = 0;
        int n2 = 1;
        int nn = 0;

        if (n == 0 || n == 1) {
            return n;
        }

        for (int i = 2; i < n + 1 ; i++) {
            nn = n1 + n2;
            n1 = n2;
            n2 = nn;
        }

            return nn;

    }

    public static int fibRec(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int temp = fibRec(n-1);
        int temp2 = fibRec(n-2);
        return  temp + temp2;
    }


}