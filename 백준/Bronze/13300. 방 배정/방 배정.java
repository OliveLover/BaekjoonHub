import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        double k = Double.parseDouble(st.nextToken());
        int result = 0;

        double[][][] room = new double[7][2][1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            room[y][s][0]++;
        }

        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                result += (int) Math.ceil(room[i][j][0] / k);
            }
        }
        System.out.println(result);
    }
}