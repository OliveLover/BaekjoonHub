import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] A = new int[n];
        int start = 0;
        int end = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (start < A[i]) start = A[i];
            end = end + A[i];
        }
        while (start <= end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (sum + A[i] > middle) {
                    count ++;
                    sum = 0;
                }
                sum += A[i];
            }
            if (sum != 0) count++;
            if (count > m) start = middle + 1;
            else end = middle - 1;
        }
        System.out.println(start);
    }
}