import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        long answer = 0;
        int strLen = n.length();
        int[] arr = new int[strLen];

        for (int i = 0; i < strLen; i++) {
            char w = n.charAt(i);

            if (w >= '0' && w <= '9') {
                arr[i] = w - '0';
            } else arr[i] = w - '7';
        }

        int j = 0;
        for (int i = strLen - 1; i >= 0; i--) {
            answer += ((long) Math.pow(b, i)) * arr[j];
            j ++;
        }

        System.out.println(answer);
    }
}