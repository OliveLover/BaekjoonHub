import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        String command = "";
        int num = 0;
        while(n > 0) {
            command = br.readLine();
            if (command.contains("push")) {
                num = Integer.parseInt(command.substring(command.contains("push_back") ? 10 : 11));
                command = command.contains("back") ? command.substring(0, 9) : command.substring(0, 10);
            }

            switch (command) {
                case "push_front" :
                    deque.addFirst(num);
                    break;
                case "push_back" :
                    deque.addLast(num);
                    break;
                case "pop_front" :
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case "pop_back" :
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case "back" :
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
                default:
                    System.out.println("잘못된 명령입니다.");
            }

            n--;
        }

        System.out.print(sb);

    }
}