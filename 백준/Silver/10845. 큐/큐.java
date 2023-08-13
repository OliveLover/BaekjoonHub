import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        String command = "";

        while (n > 0) {
            command = br.readLine();
            int num = 0;
            if (command.contains("push")) {
                num = Integer.parseInt(command.substring(5));
                command = "push";
            }

            switch (command) {
                case "push":
                    queue.add(num);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? -1 : queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.peekFirst() != null ? queue.peekFirst() : -1).append("\n");
                    break;
                case "back":
                    sb.append(queue.peekLast() != null ? queue.peekLast() : -1).append("\n");
                    break;
                default:
                    System.err.println("잘못된 명령어 입니다.");
            }
            n--;
        }
        System.out.println(sb);
    }
}