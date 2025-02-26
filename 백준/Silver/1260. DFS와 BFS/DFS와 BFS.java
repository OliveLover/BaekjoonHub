import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] VISITED;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int e = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());

            A[e].add(u);
            A[u].add(e);
        }

        for (int i = 1; i < n + 1; i++) {
            Collections.sort(A[i]);
        }

        VISITED = new boolean[n + 1];
        DFS(v);

        sb.append("\n");

        VISITED = new boolean[n + 1];
        BFS(v);

        System.out.println(sb);
        br.close();
    }

    static void DFS(int w) {
        sb.append(w).append(" ");

        VISITED[w] = true;

        for (int i : A[w]) {
            if (!VISITED[i]) {
                DFS(i);
            }
        }
    }

    static void BFS(int w) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(w);
        VISITED[w] = true;
        sb.append(w).append(" ");

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i : A[now]) {
                if (!VISITED[i]) {
                    VISITED[i] = true;
                    sb.append(i).append(" ");
                    queue.add(i);
                }
            }
        }
    }

}