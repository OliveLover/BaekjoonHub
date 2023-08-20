import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
  static int n;
  static List<Integer> primeList = new ArrayList<>();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    n = Integer.parseInt(br.readLine());

    DFS(2);
    DFS(3);
    DFS(5);
    DFS(7);

    for (int i : primeList) sb.append(i).append("\n");

    System.out.print(sb);
  }

  private static void DFS(int v) {
    if (n == String.valueOf(v).length()) primeList.add(v);
    else {
      for (int i = 1; i < 10; i +=2) {
        if (isPrime(v*10 + i)) DFS(v*10 + i);
      }
    }
  }

  private static boolean isPrime(int num) {
    for (int i = 2; i < (num / 2 + 1); i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
  
}