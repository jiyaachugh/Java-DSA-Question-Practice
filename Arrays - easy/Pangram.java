public class Pangram {
    public static boolean Pangram(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            sentence.toLowerCase();
            char ch = sentence.charAt(i);

            if(ch > 'a' && ch < 'z'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String sentence = "jiyag";
        System.out.println(Pangram(sentence));
    }
}
