import java.util.Arrays;

public class PrintAllSubs {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(printSubString(str));
    }

    public static String printSubString(String str) {
       for (int i = 0; i < str.length(); i++) {
            // Inner loop picks the ending point
            for (int j = i + 1; j <= str.length(); j++) {
                // Print the substring from index i to j
                System.out.println(str.substring(i, j));
            }
        }
       return str;
    }
}
