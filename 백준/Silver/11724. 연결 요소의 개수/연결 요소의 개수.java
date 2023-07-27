import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static int n, m;
  static List<List<Integer>> A;
  static boolean[] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    visited = new boolean[n + 1];

    A = new ArrayList<>();
    for(int i = 0; i < n + 1; i++) {
      A.add(new ArrayList<>());
    }

    for(int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      A.get(s).add(e);
      A.get(e).add(s);
    }

    int count = 0;

    for(int i = 1; i < n+1; i++) {
      if(!visited[i]) {
        count++;
        DFS(i);
      }
    }
    System.out.println(count);
  }

  public static void DFS(int v) {
    visited[v] = true;
    for(int i : A.get(v)) {
      if(!visited[i]) {
        DFS(i);
      }
    }
  }
}