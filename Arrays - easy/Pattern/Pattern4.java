public class Pattern4 {
    public static void main(String[] args) {
        numTri(5);
    }

    public static void numTri(int n) {
        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
