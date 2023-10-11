import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0) break;
            boolean flag = false;
            if (a < b) {
                if (b % a == 0) sb.append("factor").append("\n");
                else flag = true;
            } else {
                if (a % b == 0) sb.append("multiple").append("\n");
                else flag = true;
            }
            if (flag) sb.append("neither").append("\n");
        }
        System.out.print(sb);
    }
}