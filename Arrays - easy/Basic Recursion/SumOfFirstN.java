public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sumN(10));
    }

    public static int sumN(int n){
        int sum = 0;
        if(n == 1) {
            return 1;
        }
        sum = sumN(n - 1);
        return sum + n;
    }
}
