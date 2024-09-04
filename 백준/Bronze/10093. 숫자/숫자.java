import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long first = Integer.parseInt(st.nextToken());
        long second = Integer.parseInt(st.nextToken());

        long range1 = Math.min(first, second);
        long range2 = Math.max(first, second);

        if (range1 == range2) {
            sb.append(0).append("\n");
        } else {
            sb.append(range2 - range1 - 1).append("\n");
        }

        if (range2 - range1 == 1 || range2 - range1 == 0) {
            sb.append(" ");
        }

        for (long i = range1 + 1; i < range2; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}