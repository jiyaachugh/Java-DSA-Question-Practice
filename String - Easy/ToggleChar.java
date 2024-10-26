import java.util.Scanner;

public class ToggleChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());

        for (int i = 0; i < str.length() ; i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ch == ' ') continue;
            if(ascii >= 97) flag = false;
            if(flag == true) { //capital
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            } else {
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }

        }
        System.out.println(str);
    }
}
