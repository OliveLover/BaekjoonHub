import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[3][4];

        for (int i = 0; i < 3; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 0) {
                    count++;
                }
            }

            switch (count) {
                case 4:
                    sb.append('D');
                    break;
                case 3:
                    sb.append('C');
                    break;
                case 2:
                    sb.append('B');
                    break;
                case 1:
                    sb.append('A');
                    break;
                default:
                    sb.append('E');
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}