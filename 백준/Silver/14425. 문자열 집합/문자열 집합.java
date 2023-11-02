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

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        String[] set = new String[m];
        for (int i = 0; i < m; i++) {
            set[i] = br.readLine();
        }

        int count = 0;
        for (String str : arr) {
            for (String setStr : set) {
                if (str.equals(setStr)) count++;
            }
        }
        System.out.println(count);
    }
}