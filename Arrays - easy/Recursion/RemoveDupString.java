public class RemoveDupString {
    public static void main(String[] args) {
        String s = "Jiiiiiiiyaaaaaa";
        System.out.println(delConsStr(s));
    }

    public static String delConsStr(String s) {
        int i = 0;
        int j = 0;
        String newElements = "";

        while (j < s.length()) {

            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            else if (s.charAt(j) != s.charAt(i)
                    || j == s.length() - 1) {
                newElements += s.charAt(i);
                i = j;
                j++;
            }
        }
        newElements += s.charAt(j - 1);
        return newElements;
    }

}
