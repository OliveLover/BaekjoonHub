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
        //System.out.println("n = " + n);
        int number;
        String str;
        int strLength;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            number = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            strLength = str.length();
            for (int j = 0; j < strLength; j++) {
                char s = str.charAt(j);
                sb.append(String.valueOf(s).repeat(Math.max(0, number)));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

}