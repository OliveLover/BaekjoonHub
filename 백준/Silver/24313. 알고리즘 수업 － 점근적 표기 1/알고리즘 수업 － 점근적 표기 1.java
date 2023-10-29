import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());

        long f = (long)a1 * n + a0;
        long o = (long)c * n;

        if ((f <= o) && a1 <= c) System.out.println(1);
        else System.out.println(0);
    }
}