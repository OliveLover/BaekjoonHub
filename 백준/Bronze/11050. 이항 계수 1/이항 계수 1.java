import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int denominator = 1;
        int count = k;
        while (count > 0) {
            denominator *= n;
            n--;
            count--;
        }

        int molecule = 1;
        while (k > 0) {
            molecule *= k;
            k--;
        }

        int result = denominator / molecule;
        System.out.println(result);
    }
}