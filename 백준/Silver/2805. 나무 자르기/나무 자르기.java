import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] heights = new long[n];
        long start = 0;
        long end = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
            if (end < heights[i]) end = heights[i];
        }
        boolean find = false;

        while (start <= end) {
            long middle = (start + end) / 2;
            long sum = 0;
            for (long i : heights) {
                if (i - middle < 0) continue;
               sum += (i - middle);
            }
            if(sum > m) start = middle + 1;
            else if (sum < m) end = middle - 1;
            else {
                find = true;
                sb.append(middle);
                break;
            }
        }
        if (!find) sb.append(end);

        System.out.println(sb);

    }
}