import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  static int n;
  static List<Long> numList = new ArrayList<>();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());

    DFS(2);
    DFS(3);
    DFS(5);
    DFS(7);

    for (long num : numList) sb.append(num).append("\n");

    System.out.print(sb);
  }

  private static void DFS(long num) {
    if (n == String.valueOf(num).length()) numList.add(num);
    else {
      for (int i = 1; i < 10; i += 2) {
        if(isPrime(10*num + i))
        DFS(10*num + i);
      }
    }
  }

  private static boolean isPrime(long num) {
    for (long i = 2; i < (num / 2) + 1L; i++) {
      if(num % i == 0) return false;
    }
    return true;
  }
}