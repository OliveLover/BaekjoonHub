import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<n+1; i++) {
            queue.offer(i);
        }

        int qSize = queue.size();
        while (qSize > 1) {
            queue.poll();
            queue.offer(queue.poll());
            qSize = queue.size();
        }

        System.out.println(queue.peek());

    }
}