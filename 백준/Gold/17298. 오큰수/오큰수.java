import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack();
    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      Integer num = Integer.parseInt(st.nextToken());
      arr[i] = num;
    }

    for (int i = 0; i < n; i++) {
      while(!stack.isEmpty() && (arr[stack.peek()] < arr[i])) {
        arr[stack.pop()] = arr[i];
      }
      stack.push(i);
    }

    while(!stack.isEmpty()) {
      arr[stack.pop()] = -1;
    }

    for(int i = 0; i < n; i++) {
      sb.append(arr[i]).append(" ");
    }

    System.out.println(sb);
  }
}