import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            sb.append(" ".repeat(Math.max(0, n - 1 - i)));
            sb.append("*".repeat(i + 1));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}