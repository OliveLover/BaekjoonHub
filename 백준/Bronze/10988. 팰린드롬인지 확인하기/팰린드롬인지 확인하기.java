import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int strLen = str.length();
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < strLen / 2; i++) {
            char w = str.charAt(i);

            characterStack.push(w);
        }

        int startIdx = (int) Math.ceil((double)strLen / 2);
        for (int i = startIdx; i < strLen; i++) {
            char rw = str.charAt(i);

            if (characterStack.peek() == rw) {
                characterStack.pop();
            } else {
                break;
            }
        }

        sb.append(characterStack.isEmpty() ? 1 : 0);
        System.out.println(sb);
    }
}