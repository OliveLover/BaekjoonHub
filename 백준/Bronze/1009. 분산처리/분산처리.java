import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            double a = Integer.parseInt(st.nextToken())%10;
            double b = Integer.parseInt(st.nextToken());

            double answer = a;
            for (int j = 0; j < b-1; j++) {
                answer = answer*a%10;
            }
            if(answer == 0) answer = 10;

            sb.append((int)answer).append("\n");
        }

        System.out.print(sb);

    }
}
