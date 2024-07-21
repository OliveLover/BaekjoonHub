import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean flag = true;
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();

        Stack[] stacks = new Stack[]{
                stack1, stack2, stack3, stack4
        };

        st = new StringTokenizer(br.readLine(), " ");

        int slide = 0;
        for (int i = 0; i < n; i++) {
            if (!flag) break;

            slide = 0;
            int num = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 4; j++) {
                if (stacks[slide].isEmpty()) {
                    stacks[slide].push(num);
                    break;
                }

                if ((int) stacks[slide].peek() > num) {
                    slide++;
                } else {
                    stacks[slide].push(num);
                    break;
                }

                if (j == 3) {
                    flag = false;
                }
            }

        }

        System.out.println(flag ? "YES" : "NO");

    }
}