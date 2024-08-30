import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            int a = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int[] arr = new int[a];
            int arrSize = arr.length;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arrSize; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if (arr[i] < x) {
                    sb.append(arr[i]).append(" ");
                }
            }
            System.out.println(sb);
        }
}