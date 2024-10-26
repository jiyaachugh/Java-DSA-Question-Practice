public class ToggleStrings {
    public static void main(String[] args) {
        String str = "DeLHi";
        System.out.println(toggleCh(str));
    }

    public static String toggleCh(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ch == ' ') continue;
            if (ascii >= 97) flag = false;
            if (flag == true) { //capital
                ascii += 32;
                char dh = (char)ascii;
                str = str.substring(0, 1) + dh + str.substring(i + 1);
            } else {
                ascii -= 32;
                char dh = (char)ascii;
                str = str.substring(0, 1) + dh + str.substring(i + 1);
            }
        }
        return str;
    }
}
