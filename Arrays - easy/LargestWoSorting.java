import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestWoSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        //user input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for index " + i );
            arr[i] = in.nextInt();
        }
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr) {
        int largst = Integer.MIN_VALUE;;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > largst) {
                largst = arr[i];
            }
        }
        return largst;
    }
}
