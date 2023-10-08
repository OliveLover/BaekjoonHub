import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (n != 0) {
            int remainder = n % b;
            if (9 < remainder && remainder < 36) stack.add((char) (remainder + '7'));
            else stack.add((char) (remainder + 48));
            n = n / b;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.print(sb);
    }
}