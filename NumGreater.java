import java.lang.reflect.Array;
import java.util.Arrays;

public class NumGreater {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(smallerCurrent(nums));
    }

    public static String smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(j != i & nums[j] < nums[i]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return Arrays.toString(arr);
    }

    public static String smallerCurrent(int[] nums)  {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                count++;
            }
            arr[i] = count;
        }
        return Arrays.toString(arr);
    }
}
