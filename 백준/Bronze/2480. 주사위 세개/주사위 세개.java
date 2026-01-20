import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int numberCount[] = new int[6];
        int maxNum = 0;

        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken()) - 1;
            numberCount[num] ++;

            if (maxNum < num + 1) maxNum = num + 1;
        }

        br.close();

        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < numberCount.length; i++) {
            if (maxCount < numberCount[i]) {
                maxCount = numberCount[i];
                index = i;
            }
        }

        if (maxCount == 1) {
            sb.append(maxNum * 100);
        }

        if (maxCount == 2) {
            sb.append(1_000 + (index + 1) * 100);
        }

        if (maxCount == 3) {
            sb.append(10_000 + (index + 1) * 1_000);
        }

        System.out.println(sb);
    }
}