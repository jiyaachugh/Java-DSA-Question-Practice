public class Pattern3 {
    public static void main(String[] args) {
        invTrian(5);
    }

    public static void invTrian(int n) {
        for (int i = n; i > 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
