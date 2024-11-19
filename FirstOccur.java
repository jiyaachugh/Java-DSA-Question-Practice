public class FirstOccur {
    public static void main(String[] args) {
        String haystack = "jiyachughji";
        String needle = "ji";
        System.out.println(firstOcc(haystack,needle));
    }
    static int firstOcc(String haystack,String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;

    }
}
