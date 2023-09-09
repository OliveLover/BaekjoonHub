import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        int m = M + C;

        if (m >= 60) {
            H += m/60;
            m %= 60;
            if (H >= 24) {
                H -= 24;
            }
        }
        System.out.println(H + " "+ m);
    }
}