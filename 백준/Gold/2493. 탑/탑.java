import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int top = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()) {
                if(stack.peek()[1] >= top) {
                    sb.append(stack.peek()[0]).append(" ");
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append(0 + " ");
            }

            stack.push(new int[]{i + 1, top});

        }
        System.out.println(sb);
    }
}