public class RichestWealth {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(richest(nums));
    }

    public static int richest(int[][] nums) {
        int maxWealth = 0;
        for (int i = 0; i < nums.length; i++) {
            int crntWealth = 0;
            for (int j = 0; j < nums[i].length; j++) {
                crntWealth += nums[i][j];
            }
            if (crntWealth > maxWealth) {
                maxWealth = crntWealth;
            }
        }

        return maxWealth;
        }
    }
