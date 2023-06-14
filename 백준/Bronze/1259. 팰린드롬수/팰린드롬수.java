import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        //String strNum = br.readLine();
        String strNum = sc.nextLine();



        while(true) {
            if(strNum.equals("0")) break;

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
                if(stack.isEmpty()) System.out.println("yes");
                else System.out.println("no");
            } else {
                int midIndex = strNumLength/2;
                //System.out.println(strNumLength);
                //System.out.println(midIndex);
                for(int i=0; i<midIndex; i++) {
                    char n = strNum.charAt(i);
                    stack.push(n);
                }
                for(int i=midIndex+1; i<strNumLength; i++) {
                    char n = strNum.charAt(i);
                    if(stack.peek().equals(n)) {
                        //System.out.println("peek :" + stack.peek());
                        stack.pop();
                    }
                }
                if(stack.isEmpty()) System.out.println("yes");
                else System.out.println("no");
                //System.out.println(stack.size());
            }
            //strNum = br.readLine();
            strNum = sc.nextLine();
        }
    }
}