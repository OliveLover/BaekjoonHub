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
        int[] cards = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());

            max = Math.max(cards[i], max);
            min = Math.min(cards[i], min);
        }

        int m = Integer.parseInt(br.readLine());
        int[] check = new int[m];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            check[i] = Integer.parseInt(st.nextToken());

            max = Math.max(check[i], max);
            min = Math.min(check[i], min);
        }

        if (min != 0) {
            for (int i = 0; i < m; i++) {
                check[i] = check[i] - min;
            }

            for (int i = 0; i < n; i++) {
                cards[i] = cards[i] - min;
            }
        }

        int range = max - min + 1;
        int[] idxArr = new int[range];

        for (int card : cards) {
            idxArr[card]++;
        }

        for (int i = 0; i < m; i++) {
            sb.append(idxArr[check[i]]).append(" ");
        }

        System.out.println(sb);

    }
}