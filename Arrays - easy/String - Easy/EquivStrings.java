public class EquivStrings {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1 = "";
        String sum2 = "";
        for (int i = 0; i < word1.length; i++) {
            sum1 = word1[i] + word1[i + 1];
        }
        for (int i = 0; i < word2.length; i++) {
            sum2 = word2[i] + word2[i + 1];
        }
        if(sum1.equals(sum2)) {
            return true;
        }
        return false;
    }
}
