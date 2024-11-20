public class HalfStringAlike {
    public static void main(String[] args) {
        String s = "book";
        halvesAreAlike(s);
    }
    public static boolean halvesAreAlike(String s) {
        int size = s.length();
        char[] a = new char[Integer.parseInt(s.substring(0, size - 1))];
        char[] b = new char[Integer.parseInt(s.substring(size/2,size))];

        for (int i = 0; i < a.length; i++) {

        }

        return
    }
}
