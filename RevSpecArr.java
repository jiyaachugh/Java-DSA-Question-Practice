import java.util.Arrays;
import java.util.Scanner;

public class RevSpecArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter start index: ");
        int s = in.nextInt();
        System.out.println("Enter end index: ");
        int e = in.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = in.nextInt();
        }

        System.out.println("The Array created is:" + Arrays.toString(arr));

        revArr(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }

    public static void revArr(int[] arr, int s, int e) {
        int stt = s;
        int end = e;

        while(stt < end) {
            int temp = arr[stt];
            arr[stt] = arr[end];
            arr[end] = temp;
            stt++;
            end--;
        }
    }
}
