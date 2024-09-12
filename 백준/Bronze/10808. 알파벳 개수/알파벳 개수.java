import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphaArr = new int[26];

        String str = br.readLine();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            alphaArr[str.charAt(i) - 'a']++;
        }

        Arrays.stream(alphaArr).forEach(e -> System.out.print(e + " "));
    }
}