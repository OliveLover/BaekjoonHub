import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<Integer> josephus = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> numList = new ArrayList<>(n);

        for (int i = n; i > 0; i--) {
            josephus.addFirst(i);
        }

        int count = 0;
        while (!josephus.isEmpty()) {
            if (count == k) count = 0;

            int temp = josephus.pollFirst();

            if (count != k - 1) {
                josephus.addLast(temp);
            } else {
                numList.add(temp);
            }

            count++;
        }

        for (int i = 0; i < n; i++) {
            if (n == 1) {
                sb.append("<").append(numList.get(i)).append(">");
            } else if (i == 0) {
                sb.append("<").append(numList.get(i)).append(", ");
            } else if (i == n - 1) {
                sb.append(numList.get(i)).append(">");
            } else {
                sb.append(numList.get(i)).append(", ");
            }
        }

        System.out.print(sb);
    }
}