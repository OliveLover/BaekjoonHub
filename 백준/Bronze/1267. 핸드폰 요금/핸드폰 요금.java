import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] t = new int[n];

        int y = 0;
        int m = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(st.nextToken());

            y += 10 + (t[i] / 30) * 10;
            m += 15 + (t[i] / 60) * 15;

        }

        if(y == m) {
            System.out.println("Y M " + y);
        } else {
            System.out.println(Math.min(y, m) == y ? "Y " + y : "M " + m);
        }

    }
}