public class arrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i == n) {
                count++;
            }
        }
        return count;
    }
}
