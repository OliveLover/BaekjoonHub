import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String strNum = br.readLine();

        while(!strNum.equals("0")) {
            Stack<Character> stack = new Stack<>();

            int strNumLength = strNum.length();

            if(strNumLength % 2 == 0) {
                for(int i=0; i<strNumLength/2; i++) {
                    char n = strNum.charAt(i);
                    stack.push(n);
                }
                for(int i=strNumLength/2; i<strNumLength; i++) {
                    char n = strNum.charAt(i);
                    if(stack.peek().equals(n)) {
                        stack.pop();
                    }
                }
            } else {
                int midIndex = strNumLength/2;
                for(int i=0; i<midIndex; i++) {
                    char n = strNum.charAt(i);
                    stack.push(n);
                }
                for(int i=midIndex+1; i<strNumLength; i++) {
                    char n = strNum.charAt(i);
                    if(stack.peek().equals(n)) {
                        stack.pop();
                    }
                }
            }

            if(stack.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");

            strNum = br.readLine();
        }
        System.out.print(sb);
    }
}