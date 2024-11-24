import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        printNo(n);
    }

public static void printNo(int n) {
    if (n < 1) {
        return;
    }
    System.out.print(n + " ");
    printNo(n - 1);
 }
}