import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> merge = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int deck = Integer.parseInt(br.readLine());
            merge.add(deck);
        }

        int deck1 = 0;
        int deck2 = 0;
        int sum = 0;

        while (merge.size() != 1) {
            deck1 = merge.remove();
            deck2 = merge.remove();

            sum += deck1 + deck2;
            merge.add(deck1 + deck2);
        }
        System.out.println(sum);
    }
}