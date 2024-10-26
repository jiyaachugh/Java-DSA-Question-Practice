public class PerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        for (long i = 0; i < num; i++) {
            if(i * i == num) {
                return true;
            } else if (num == 1 || num == 0) {
                return true;
            }
        }
        return false;
    }
}
