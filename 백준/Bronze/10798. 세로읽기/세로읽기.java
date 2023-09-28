import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[5][15];
        int[] strLength = new int[5];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            strLength[i] = str.length();
            for (int j = 0; j < str.length(); j++) {
                char w = str.charAt(j);
                arr[i][j] = w;
            }
        }

        for (int j = 0; j < Arrays.stream(strLength).max().orElse(0); j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != 0) {
                    sb.append(arr[i][j]);
                }
            }
        }
        System.out.println(sb);
    }
}
