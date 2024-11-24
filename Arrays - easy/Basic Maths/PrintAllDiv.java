import java.util.Scanner;

public class PrintAllDiv {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int N = inp.nextInt();
        System.out.println(sumOfDivisors(N));
    }

    static long sumOfDivisors(int N) {
        // code here
        long totalSum = 0;

        for (int i = 1; i <= N; i++) {
            long sumDivisors = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sumDivisors += j;
                }
            }

            totalSum += sumDivisors;
        }

        return totalSum;
    }
}
