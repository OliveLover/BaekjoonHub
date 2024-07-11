import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            char c = str.charAt(i);

            if (65 <= c && c <= 90) {
                sb.append((char) (c - ('A' - 'a')));
            } else {
                sb.append((char) (c + ('A' - 'a')));
            }
        }
        System.out.print(sb);
    }
}