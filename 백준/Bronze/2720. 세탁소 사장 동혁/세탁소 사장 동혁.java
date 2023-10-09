import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] coinValue = new int[] {25, 10, 5, 1};

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int change = Integer.parseInt(br.readLine());
            int count = 4;
            int j = 0;
            while (count > 0) {
                if (change >= coinValue[j]) {
                    sb.append(change / coinValue[j]).append(" ");
                    change = change % coinValue[j];
                } else sb.append(0).append(" ");
                j++;
                count--;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}