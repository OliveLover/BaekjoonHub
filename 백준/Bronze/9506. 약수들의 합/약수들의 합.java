import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue;

        while (true) {
            queue = new ArrayDeque<>();
            int sum = 0;
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    queue.add(i);
                    sum += i;
                }

            }

            int queueSize = queue.size();
            if (sum == n) {
                sb.append(n).append(" = ");

                for (int i = 0; i < queueSize - 1; i++) {
                    sb.append(queue.poll()).append(" + ");
                }

                sb.append(queue.poll()).append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.").append("\n");
            }
        }
        System.out.println(sb);
    }
}