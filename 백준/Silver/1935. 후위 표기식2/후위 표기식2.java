import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Double> numberList = new ArrayList<>();

        Stack<Double> stringStack = new Stack<>();
        double temp = 0;

        int n = in.nextInt();

        String postFix = in.next();
        for(int i = 0; i<n; i++) {
            numberList.add(in.nextDouble());
        }

        //연산자 리스트
        List<Character> operator = new ArrayList<>();
        operator.add('+');
        operator.add('-');
        operator.add('*');
        operator.add('/');

        //postFix
        int j = 0;
        int postFixLen = postFix.length();
        for(int i = 0; i< postFixLen; i++ ) {
            if(!operator.contains(postFix.charAt(i))) {
                

                stringStack.push(numberList.get(postFix.charAt(i)-'A'));
                
            }
            else {
                double b = stringStack.pop();
                double a = stringStack.pop();
                
                if(postFix.charAt(i) == '*') {
                    temp = a*b;
                    stringStack.push(temp);
                } else if(postFix.charAt(i) == '/') {
                    temp = a/b;
                    stringStack.push(temp);
                } else if(postFix.charAt(i) == '+') {
                    temp = a+b;
                    stringStack.push(temp);
                } else {
                    temp = a-b;
                    stringStack.push(temp);
                }
            }
        }
        String result = String.format("%.2f", stringStack.peek());
        System.out.println(result);
    }
}