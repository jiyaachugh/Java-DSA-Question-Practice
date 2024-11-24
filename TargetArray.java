import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(targetArr(nums,index));
    }

    public static String targetArr(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = nums[i];
            for (int j = 0; j < nums.length; j++) {
                target[index[i]] = index[i];
            }

        }

        return Arrays.toString(target);
    }
}
