public class PowOfFour {
    public static void main(String[] args) {
        isPowerOfFour(16);
    }
    static boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return (n % 4 == 0) && isPowerOfFour(n / 4);
    }
}
