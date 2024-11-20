import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,5,6,7,8,9,0};
        revArr(arr);
//        arr =
    }

    public static void revArr(int[] arr) {
        int stt = 0;
        int end = arr.length - 1;

        while(stt < end) {
            int temp = arr[stt];
            arr[stt] = arr[end];
            arr[end] = temp;

            stt++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
