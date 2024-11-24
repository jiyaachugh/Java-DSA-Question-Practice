import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter number for index " + i + ": ");
            arr[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
