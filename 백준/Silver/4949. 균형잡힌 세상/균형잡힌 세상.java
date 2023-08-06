import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> bracketStack;

        String sentence = "";
        while (!Objects.equals(sentence = br.readLine(), ".")) {
            String answer;
            bracketStack = new Stack<>();

            answer = bracketBalanceCheck(bracketStack, sentence);

            sb.append(answer).append("\n");
            
        }
        System.out.print(sb);
    }

    public static String bracketBalanceCheck (Stack<Character> bracketStack, String sentence) {
        String answer;
        int sentenceLength = sentence.length();

        for (int i = 0; i < sentenceLength; i++) {
            char word = sentence.charAt(i);

            if (!(word == '(' || word == '{' || word == '[' || word == ')' || word == '}' || word == ']')) continue;

            if (word == ')' && !bracketStack.isEmpty() && bracketStack.peek() == '(') bracketStack.pop();
            else if (word == '}' && !bracketStack.isEmpty() && bracketStack.peek() == '{') bracketStack.pop();
            else if (word == ']' && !bracketStack.isEmpty() && bracketStack.peek() == '[') bracketStack.pop();
            else bracketStack.push(word);
        }

        if (bracketStack.isEmpty())
            answer = "yes";
        else answer = "no";

        return answer;
    }

}