import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;
        int r = 31;
        int m = 1234567891;
        for (int i = 0; i < n; i++) {
            int word = str.charAt(i) - 'a' + 1;
            sum += word * Math.pow(r, i);
        }

        int result = sum % m;

        System.out.println(result);
    }
}