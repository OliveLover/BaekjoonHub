import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int a, b, sum = 0;

        for (int i=0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum += (a * b);
        }

        if (sum == X) System.out.println("Yes");
        else System.out.println("No");
    }
}