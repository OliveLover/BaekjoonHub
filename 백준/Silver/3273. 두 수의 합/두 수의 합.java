import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long target = Long.parseLong(br.readLine());
        Arrays.sort(arr);

        int startPoint = 0;
        int endPoint = n - 1;
        int count = 0;
        while (startPoint < endPoint) {
            if (arr[endPoint] >= target) {
                endPoint--;
                continue;
            }

            if (target < arr[startPoint] + arr[endPoint]) {
                endPoint--;
            } else if (target > arr[startPoint] + arr[endPoint]) {
                startPoint++;
            } else {
                count++;
                startPoint++;
                endPoint--;
            }

        }

        System.out.println(count);
    }
}