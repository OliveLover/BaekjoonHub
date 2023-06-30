import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int[][] apt;
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            apt = new int[k+1][n+1];

            for (int j = 0; j <= k; j++) {
                if (j == 0) {
                    for (int z = 1; z <= n; z++) {
                        apt[j][z] = z;
                    }
                } else {
                    for (int z = 1; z <= n; z++) {
                        apt[j][z] = apt[j-1][z] + apt[j][z-1];
                    }

                }
            }
            sb.append(apt[k][n]).append("\n");
        }

        System.out.print(sb);

    }
}