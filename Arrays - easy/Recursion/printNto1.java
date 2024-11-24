import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = in.nextInt();
        printNos(N);

    }

    public static void printNos(int N) {
        if(N == 0) {
            return;
        }
        printNos(N -1);
        System.out.println(N);
    }
}
