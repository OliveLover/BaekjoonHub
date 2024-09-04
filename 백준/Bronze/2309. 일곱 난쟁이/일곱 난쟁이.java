import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int height = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            height += arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (height - arr[i] - arr[j] == 100) {
                    arr[j] = 0;
                    arr[i] = 0;

                    for (int k = 0; k < 9; k++) {
                        if(arr[k] != 0) {
                            System.out.println(arr[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}