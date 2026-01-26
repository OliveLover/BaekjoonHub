import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int a = 0, b = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            x -= a * b;
        }

        System.out.println(x == 0 ? "Yes" : "No");
        
        br.close();
    }
}