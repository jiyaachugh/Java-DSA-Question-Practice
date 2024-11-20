import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LargestElArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter " + i + " number: ");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(LarEl(arr));
    }

    public static int LarEl(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
