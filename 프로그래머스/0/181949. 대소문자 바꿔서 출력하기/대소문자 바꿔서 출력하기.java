import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();

        int strLength = a.length();
        for (int i = 0; i < strLength; i++) {
            int c = a.charAt(i);
            int gap = 'a' - 'A';

            c = c + (c < 'a' ? +gap : -gap);

            sb.append((char) c);
        }
        System.out.print(sb);
    }
}