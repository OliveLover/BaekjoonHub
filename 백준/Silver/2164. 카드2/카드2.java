import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> cards = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=1; i<=n; i++) {
            cards.offer(i);
        }

        while(cards.size() != 1) {
            cards.poll();
            int top = cards.poll();
            cards.offer(top);
        }

        System.out.println(cards.peek());
    }
}