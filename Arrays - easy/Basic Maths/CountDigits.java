import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = inp.nextInt();
        System.out.println(evenlyDivides(n));
    }

        static int evenlyDivides(int n) {
            int originalNumber = n;
            int count = 0;

            while (n > 0) {
                int digit = n % 10;
                if (digit != 0 && originalNumber % digit == 0) {
                    count++;
                }
                n = n / 10;
            }

            return count;
        }
    }
}
