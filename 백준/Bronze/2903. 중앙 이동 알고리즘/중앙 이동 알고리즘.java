import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] arr = new long[16];
        arr[0] = 2;
        for (int i = 1; i < 16; i++) {
            arr[i] = arr[i - 1] * 2 - 1;
        }
        int n = Integer.parseInt(br.readLine());
        System.out.println(arr[n] * arr[n]);

    }
}