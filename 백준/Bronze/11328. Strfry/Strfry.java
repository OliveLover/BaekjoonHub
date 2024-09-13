import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean flag = true;

            StringTokenizer st = new StringTokenizer(br.readLine());

            String str1 = st.nextToken();
            int str1Length = str1.length();
            char[] str1ToCharArray = str1.toCharArray();
            Arrays.sort(str1ToCharArray);

            String str2 = st.nextToken();
            char[] str2ToCharArray = str2.toCharArray();
            Arrays.sort(str2ToCharArray);

            for (int j = 0; j < str1Length; j++) {
                if (str1ToCharArray[j] != str2ToCharArray[j]) {
                    flag = false;
                    break;
                }
            }

            sb.append(flag ? "Possible" : "Impossible").append("\n");
        }

        System.out.println(sb);

    }
}