import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n; i++) {
            System.out.println("Enter number " + i);
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}