import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  static int n;
  static StringBuilder sb;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());

    dfs(2);
    dfs(3);
    dfs(5);
    dfs(7);

    System.out.print(sb);
  }

  static void dfs(int number) {
    if (String.valueOf(number).length() == n) {
      sb.append(number).append("\n");
      return;
    }

    for (int i = 1; i < 10; i++) {
      if (i % 2 != 0) {
        if (isPrimeNumber(number * 10 + i)) {
          dfs(number * 10 + i);
        }
      }
    }
  }

  static boolean isPrimeNumber(int number) {
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) return false;
    }
    return true;
  }
}