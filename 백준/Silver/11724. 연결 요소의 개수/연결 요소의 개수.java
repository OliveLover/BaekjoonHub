import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  static int n, m;
  static List<List<Integer>> a;
  static boolean[] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    visited = new boolean[n+1];
    
    a = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      a.add(new ArrayList<>(2));
    }
    
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      a.get(u).add(v);
      a.get(v).add(u);
    }

    int count = 0;

    for (int i = 1; i <= n; i++) {
      if (!visited[i]) {
        count++;
        DFS(i);
      }
    }

    System.out.println(count);
  }

  private static void DFS(int v) {
    visited[v] = true;
    for (int i : a.get(v)) {
      if(!visited[i]) {
        DFS(i);
      }
    }
  }
}