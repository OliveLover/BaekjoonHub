import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
  static int n;
  static ArrayList<Integer> primeList = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    n = Integer.parseInt(br.readLine());

    DFS(2);
    DFS(3);
    DFS(5);
    DFS(7);

    primeList.stream().forEach(num -> sb.append(num).append("\n"));
    System.out.print(sb);
  }

  static void DFS(int number) {
    if (n == String.valueOf(number).length()) {
      primeList.add(number);
      return;
    }

    for (int i = 1; i < 10; i++) {
      if (i % 2 != 0) {
        if (isPrime(number * 10 + i)) {
          DFS(number * 10 + i);
        }
      }
    }
  }

  static boolean isPrime(int number) {
    for (int i = 2; i <= (int)Math.sqrt(number); i++) {
      if (number % i == 0)
        return false;
    }
    return true;
  }
}