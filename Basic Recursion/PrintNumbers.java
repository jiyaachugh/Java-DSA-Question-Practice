public class PrintNumbers {
    public static void main(String[] args) {
        printNo(5);
    }

    public static void printNo(int n) {
        if(n == 1 ) { System.out.print(1 + " ");
        return;}
        printNo(n-1);
        System.out.print(n + " ");


    }
}
