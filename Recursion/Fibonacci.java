import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = in.nextInt();
        System.out.println(fibo(N));
    }

    public static int fibo(int N) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        for(int i = 2; i < N +1; i++) {
            sum = n1 + n2;

            n1 = n2;
            n2 = sum;
        }
        return sum;
    }
}
