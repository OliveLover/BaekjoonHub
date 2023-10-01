import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        long start = 1;
        long end = k;
        long ans = 0;

        while (start <= end) {
            long middle = (start + end) / 2;
            long cnt = 0;

            for (int i = 1; i <= n; i++) {
                cnt += Math.min(middle / i, n);
            }

            if (cnt < k) {
                start = middle + 1;
            } else {
                ans = middle;
                end = middle - 1;
            }
        }
        System.out.println(ans);
    }
}