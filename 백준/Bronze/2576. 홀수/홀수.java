import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (arr[i] % 2 == 1 ) {
                sum += arr[i];
                min = Math.min(arr[i], min);
            }

        }
        if(sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n").append(min);
        }

        System.out.println(sb);
    }
}