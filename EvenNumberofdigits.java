public class EvenNumberofdigits {
    public static void main(String[] args) {
        int[] nums = {1,12,2323,2454,667};
        System.out.println(findNumbers(nums));

    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        int evenCount = 0;
        for(int i = 0; i < nums.length;i++){
            while(nums[i] != 0) {
                count++;
                nums[i] /= 10;
            }

            evenCount += ((count%2 == 0) ? 1: 0);
            count = 0;
        }
        return evenCount;
    }

}

