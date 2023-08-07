import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;

        int t = Integer.parseInt(br.readLine());
        boolean result = true;

        for(int i=0; i<t; i++) {
            String str = br.readLine();
            //System.out.println(str.length());
             stack = new Stack<>();
             result = true;
            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);
                //System.out.println(c);

                if(c == '(') {
                    stack.push(c);
                }
                else {
                    if(stack.empty()) {
                        System.out.println("NO");
                        result = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(result) {
                if(stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}