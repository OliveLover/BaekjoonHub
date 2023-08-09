import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        while(n > 0) {
            String commend = br.readLine();
            int num = 0;
            if(commend.contains("push")) {
                num = Integer.parseInt(commend.substring(5));
                commend = "push";
            }

            switch (commend) {
                case "push":
                    stack.push(num);
                    break;
                case "pop" :
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case "size" :
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top" :
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
            n--;
        }
        System.out.println(sb);
    }
}