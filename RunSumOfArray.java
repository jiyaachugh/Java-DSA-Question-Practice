import java.util.Arrays;
import java.util.Scanner;

public class RunSumOfArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter the size of Array: ");
//        int n = inp.nextInt();
        int[] nums = {1,2,3,4,5};
        System.out.println(RunSumArr(nums));
    }
    
    static String RunSumArr(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return Arrays.toString(nums);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
