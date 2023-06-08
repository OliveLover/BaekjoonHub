import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();

        int[] alpha = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            char w = word.charAt(i);
            for (int j = 0; j < 26; j++) {
                if (w-97 == j && alpha[j] == -1) alpha[j] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            sb.append(alpha[i]).append(" ");
        }

        System.out.print(sb);

    }
}