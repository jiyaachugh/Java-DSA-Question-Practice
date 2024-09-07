import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length/2;
        System.out.println(shuffArr(nums, n));
    }

    public static String shuffArr(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
        }
        for (int j = n ; j < nums.length; j++) {
            arr[2* (j - n) + 1] = nums[j];
            }
        return Arrays.toString(arr);
    }
}
