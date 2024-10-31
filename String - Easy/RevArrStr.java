public class RevArrStr {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l'};
        int n = s.length;
        for(int i=0; i<n/2; i++)
        {
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
        System.out.println(s);
    }
}
