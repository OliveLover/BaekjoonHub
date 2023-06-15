import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i = 0;
        int sum = 0;
        int max = 0;

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            if ( max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println((double)sum*100/max/N);
    }
}