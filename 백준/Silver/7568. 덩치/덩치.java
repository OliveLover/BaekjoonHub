import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] sizeArr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            sizeArr[i][0] = Integer.parseInt(st.nextToken());
            sizeArr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (sizeArr[i][0] < sizeArr[j][0] && sizeArr[i][1] < sizeArr[j][1]) {
                        rank++;
                    }
                }
            }

            sb.append(rank).append(" ");
        }
        
        System.out.println(sb);

    }
}