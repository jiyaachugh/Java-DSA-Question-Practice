import java.util.Scanner;

public class RevNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = inp.nextInt();
        System.out.println(revNum(n));
    }

    public static int revNum(int n) {
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
        return revNum;
    }
}
