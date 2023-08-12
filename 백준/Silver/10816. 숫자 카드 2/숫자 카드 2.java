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

            if (cards[i] > max) max = cards[i];
            if (cards[i] < min) min = cards[i];
        }

        int m = Integer.parseInt(br.readLine());
        int[] check = new int[m];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            check[i] = Integer.parseInt(st.nextToken());

            if (check[i] > max) max = check[i];
            if (check[i] < min) min = check[i];
        }

        if (min != 0) {
            for (int i = 0; i < m; i++) {
                check[i] = check[i] - min;
            }

            for (int i = 0; i < n; i++) {
                cards[i] = cards[i] - min;
            }
        }

        int range = Math.abs(max - min + 1);
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