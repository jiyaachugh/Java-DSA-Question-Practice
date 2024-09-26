public class Solution {
    public static void main(String[] args) {

    }

        public boolean isPalindrome(int x) {
            // Negative numbers are not palindromes
            if (x < 0) {
                return false;
            }

            int original = x;
            int revNum = 0;

            while (x != 0) {
                int lstd = x % 10;
                revNum = (revNum * 10) + lstd;
                x = x / 10;
            }

            // Check if the original number is equal to the reversed number
            return original == revNum;
        }

}