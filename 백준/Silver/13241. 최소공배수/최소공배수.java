import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[2];

        for (int i = 0; i < 2; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long a = Math.min(arr[0], arr[1]);
        long b = Math.max(arr[0], arr[1]);

        long gcd = gcd(a, b);
        long lcm = a * b / gcd;

        System.out.println(lcm);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}