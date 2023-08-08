import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> numStack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            int inputNum = Integer.parseInt(br.readLine());

            if(inputNum == 0) numStack.pop();
            else numStack.push(inputNum);

            n--;
        }

        int sum = 0;
        for(int j : numStack) {
            sum += j;
        }

        System.out.println(sum);
    }
}