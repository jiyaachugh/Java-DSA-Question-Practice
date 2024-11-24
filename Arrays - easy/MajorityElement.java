public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

//    public static int majorityElt(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] == nums[i]) {
//                    count++;
//                }
//                if(count > n/2){
//                    return nums[i];
//                }
//            }
//        }
//
//        return -1;
//    }

    public static int majorityElement(int[] nums) {
        int count =0;
        int curr = nums[0];

        for(int i=0;i<nums.length;i++)
        {

            if(curr == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==-1)
            {
                curr = nums[i];
                count =0;
            }
        }
        return curr;
    }
}
