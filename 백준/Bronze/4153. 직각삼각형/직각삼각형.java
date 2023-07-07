import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {
            int[] arr = new int[3];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            Arrays.sort(arr);

            boolean result = arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2];
            if(result) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");

        }

        System.out.print(sb);

    }
}
