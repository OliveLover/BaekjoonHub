import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] distance;
    static ArrayList<Edge>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        A = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());

            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if (e == -1) break;

                int value = Integer.parseInt(st.nextToken());
                A[v].add(new Edge(e, value));
            }
        }

        distance = new int[n + 1];
        visited = new boolean[n + 1];

        BFS(1);

        int max = 1;

        for (int i = 2; i <= n; i++) {
            if (distance[max] < distance[i]) max = i;
        }

        distance = new int[n + 1];
        visited = new boolean[n + 1];

        BFS(max);

        Arrays.sort(distance);
        System.out.println(distance[n]);
    }

    private static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(index);
        visited[index] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Edge i : A[now]) {
                int e = i.e;
                int value = i.value;
                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[now] + value;
                }
            }
        }
    }

    static class Edge {
        int e;
        int value;

        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }
}