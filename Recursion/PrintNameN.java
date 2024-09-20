import java.util.Scanner;

public class PrintNameN {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your beautiful  name: ");
        String name = inp.nextLine();
        System.out.print("Enter number of time you want to print your name: ");
        int n = inp.nextInt();
        printName(name,n);
    }

    public static void printName(String name, int n) {
        if(n == 1) {
            System.out.println(name + " ");
            return;
        }
        printName(name, n - 1);
        System.out.println(name + " ");
    }

}

