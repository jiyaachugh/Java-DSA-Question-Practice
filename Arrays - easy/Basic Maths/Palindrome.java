import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = inp.nextInt();
        System.out.println(palin(n));

    }

    public static boolean palin(int n) {
        int orig = n;
        int revNum = 0;

        if(n < 0){
            System.out.println("invalid");
        }

        while(n != 0) {
            int lstd = n % 10;
            revNum = revNum * 10 + lstd;
            n = n / 10;
        }
        return orig == revNum;
    }
}
