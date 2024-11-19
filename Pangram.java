public class Pangram {
    public static boolean Pangram(String sentence) {
        int arr[]= new int[26];

        for(int i=0;i<sentence.length();i++)
            arr[sentence.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
            if(arr[i]< 1)
                return false;

        return true;
    }

    public static void main(String[] args) {
        String sentence = "jiyag";
        System.out.println(Pangram(sentence));
    }
}
