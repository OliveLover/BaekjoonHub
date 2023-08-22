import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<List<Integer>> nodeList;
    static boolean[] visited;
    static List<Integer> resultList;
    static Queue<Integer> BFSList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        nodeList = new ArrayList<>(m + 1);
        visited = new boolean[n + 1];
        resultList = new ArrayList<>(n);
        BFSList = new LinkedList<>();

        for (int i = 0; i <= n; i++) {
            nodeList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            nodeList.get(x).add(y);
            nodeList.get(y).add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(nodeList.get(i));
        }

        DFS(v);

        for (int i = 0; i < resultList.size(); i++) {
            if (i == resultList.size() - 1) {
                sb.append(resultList.get(i)).append("\n");
            } else {
                sb.append(resultList.get(i)).append(" ");
            }
        }

        visited = new boolean[n + 1];
        resultList = new ArrayList<>(n);

        BFS(v);

        for (int i = 0; i < resultList.size(); i++) {
            sb.append(resultList.get(i)).append(" ");
        }

        System.out.print(sb);
    }

    public static void DFS(int v) {
        resultList.add(v);
        visited[v] = true;
        for (int i : nodeList.get(v)) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int v) {
        BFSList.add(v);
        visited[v] = true;
        while (!BFSList.isEmpty()) {
            int nowNode = BFSList.poll();
            resultList.add(nowNode);
            for (int i : nodeList.get(nowNode)) {
                if (!visited[i]) {
                    visited[i] = true;
                    BFSList.add(i);
                }
            }
        }
    }
}
