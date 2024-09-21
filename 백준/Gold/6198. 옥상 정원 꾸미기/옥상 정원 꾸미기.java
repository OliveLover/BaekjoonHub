import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Long> stack = new Stack<>();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            long top = arr[i];

            while (!stack.empty() && stack.peek() <= top) {
                stack.pop();
            }

            result += stack.size();
            stack.push(top);
        }
        System.out.println(result);
    }
}