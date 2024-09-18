public class Pattern2 {
    public static void main(String[] args) {
        pat2(5);
    }
    public static void pat2(int n) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
