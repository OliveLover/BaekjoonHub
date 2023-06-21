import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());

        //수열 리스트 생성
        for(int i=0; i<n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        //System.out.println(list);

        int val = 1;
        boolean result = true;
        Stack<Integer> stack = new Stack<>();
        for(int su: list) {
            if(su>=val) {
                while (su >= val) {
                    stack.push(val);
                    val++;
                    sb.append('+').append('\n');
                }
                stack.pop();
                sb.append('-').append('\n');
            }
            else {
                int N = stack.pop();
                if(N>su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append('-').append('\n');
                }
            }
        }
        if(result) System.out.println(sb);
    }
}