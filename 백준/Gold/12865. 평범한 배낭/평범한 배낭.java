import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 물건의 수
        int k = in.nextInt(); // 버틸 수 있는 무게

        // dp[i][k] = Math.max(dp[i-1][k], 지금 물건의 가치 + dp[i][k-지금 물건의 무게])
        // dp[i][k] = Math.max(dp[i-1][k],            Vi + dp[i][k-Wi])
        int[] w = new int[n+1]; // 물건의 무게
        int[] v = new int[n+1]; // 물건의 가치
        int[][] dp = new int[n+1][k+1];

        //n개의 물건만큼 반복
        for(int i=1; i<=n; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }

        for(int i = 1; i<=n; i++) { // i : i 번째 물건
            for(int j =1; j<=k; j++) { // j : 현재 가방에 담을 수 있는 최대 무게
                //가방의 최대 무게 < 지금 물건 무게
                if(j < w[i]) {
                    dp[i][j] = dp[i-1][j];
                }

                // 더 담을 수 있을 경우
                else {
                    dp[i][j] = Math.max(dp[i-1][j], v[i] + dp[i-1][j-w[i]]);
                }

            }
        }
        System.out.println(dp[n][k]);
    }
}