import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
  static boolean arrive;
  static List<List<Integer>> relation;
  static boolean[] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    relation = new ArrayList<>(m);
    visited = new boolean[n];

    for (int i = 0; i < n; i++) relation.add(new ArrayList<>());

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      relation.get(a).add(b);
      relation.get(b).add(a);
    }

    for (int i = 0; i < m; i++) {
      DFS(i, 1);

      if (arrive) break;
    }

    if (arrive) System.out.println(1);
    else System.out.println(0);
  }

  private static void DFS(int v, int count) {
    if (count == 5) {
      arrive = true; 
      return;
    }
    
    visited[v] = true;

    for (int i : relation.get(v)) {
      if (!visited[i]) DFS(i, count + 1);
    }

    visited[v] = false;
  }
  
}