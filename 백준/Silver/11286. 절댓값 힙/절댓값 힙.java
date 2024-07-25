import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            } else {
                return first_abs - second_abs;
            }
        });

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x != 0) {
                priorityQueue.add(x);
            }

            if (x == 0) {
                if (priorityQueue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(priorityQueue.poll()).append("\n");
                }
            }
        }

        System.out.print(sb);

    }
}