import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
  static ArrayList<Integer>[] A;
  static StringBuilder sb = new StringBuilder();
  static boolean[] VISITED;
  static ArrayList<Integer> DFS = new ArrayList<>();
  static ArrayList<Integer> BFS = new ArrayList<>();
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    A = new ArrayList[n + 1];
    VISITED = new boolean[n + 1];

    for (int i = 1; i < n + 1; i++) {
      A[i] = new ArrayList<Integer>();
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());

      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      A[u].add(v);
      A[v].add(u);
    }

    for (int i = 1; i < n + 1; i++) {
      Collections.sort(A[i]);
    }

    DFS(s);
    VISITED = new boolean[n + 1];
    BFS(s);

    for (int i : DFS) {
      sb.append(i).append(" ");
    }

    sb.append("\n");

    for (int i : BFS) {
      sb.append(i).append(" ");
    }
    
    System.out.println(sb);
  }

  static void DFS(int Node) {
    if (VISITED[Node]) {
      return;
    }

    VISITED[Node] = true;
    DFS.add(Node);
    
    for (int i : A[Node]) {
      DFS(i);
    }
  }

  static void BFS(int Node) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(Node);
    VISITED[Node] = true;

    while (!queue.isEmpty()) {
      int nowNode = queue.poll();
      BFS.add(nowNode);
      for (int i : A[nowNode]) {
        if (!VISITED[i]) {
          VISITED[i] = true;
          queue.add(i);
        }
      }
    }
  }
}