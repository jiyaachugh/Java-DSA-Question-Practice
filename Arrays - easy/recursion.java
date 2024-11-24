import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dataType = in.nextLine();
        System.out.println(dataTypeSize(dataType));
    }

//    static int fibo(int n) {
//        // base cond
//        if(n < 2) {
//            return n;
//        }
//
//        return fibo(n-1) + fibo(n-2);
//    }

//    static int facto(int n){
//        int pdt = 1;
//        for (int i = 1; i < n+1; i++) {
//            pdt *= i;
//        }
//        return pdt;
//
//    }
public static int dataTypeSize(String dataType) {

    switch (dataType.toLowerCase()) {

        case "byte":
            return Byte.BYTES;
        case "short":
            return Short.BYTES;
        case "int":
            return Integer.BYTES;
        case "long":
            return Long.BYTES;
        case "float":
            return Float.BYTES;
        case "double":
            return Double.BYTES;
        case "char":
            return Character.BYTES;
        case "boolean":
            return 1;
        default:
            return -1;
    }

}

}
