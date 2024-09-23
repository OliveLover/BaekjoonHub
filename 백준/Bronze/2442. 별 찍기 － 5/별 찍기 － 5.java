import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int j = n;
        for (int i = 1; i <= n; i++) {
            sb.append((" ").repeat(--j));
            sb.append(("*").repeat(2 * i - 1));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}