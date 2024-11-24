public class Pattern1 {
    public static void main(String[] args) {
        starRect(5);
    }

    public static void starRect(int n) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
