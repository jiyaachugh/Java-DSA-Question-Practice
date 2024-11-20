public class Pattern5 {
    public static void main(String[] args) {
        invNumTri(5);
    }

    public static void invNumTri(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
