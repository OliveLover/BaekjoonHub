import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
  static ArrayList<Integer>[] FRIENDLIST;
  static boolean[] VISITED;
  static boolean ARRIVE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    FRIENDLIST = new ArrayList[n];
    VISITED = new boolean[n];
    ARRIVE = false;

    for (int i = 0; i < n; i++) {
      FRIENDLIST[i] = new ArrayList<>();
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());

      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      FRIENDLIST[u].add(v);
      FRIENDLIST[v].add(u);
    }

    for (int i = 0; i < n; i++) {
      DFS(i, 1);

      if (ARRIVE)
        break;
    }

    if (ARRIVE)
      System.out.println("1");
    else
      System.out.println("0");
  }

  static void DFS(int now, int depth) {
    if (depth == 5 || ARRIVE) {
      ARRIVE = true;
      return;
    }

    VISITED[now] = true;

    for (int i : FRIENDLIST[now]) {
      if (!VISITED[i]) {
        DFS(i, depth + 1);
      }
    }

    VISITED[now] = false;
  }
}