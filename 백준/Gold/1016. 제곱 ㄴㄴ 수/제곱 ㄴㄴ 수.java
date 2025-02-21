import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        boolean[] check = new boolean[(int) (max - min + 1)];

        for (long i = 2; i * i <= max; i++) {
            long pow = i * i;

            long startIndex = Math.max(pow, (min + pow - 1) / pow * pow);

            for (long j = startIndex; j <= max; j += pow) {
                check[(int) (j - min)] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
