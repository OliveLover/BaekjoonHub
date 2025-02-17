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

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());

            int node = Integer.parseInt(st.nextToken());

            while(true) {
                int v = Integer.parseInt(st.nextToken());
                if (v == -1) break;

                int value = Integer.parseInt(st.nextToken());

                A[node].add(new Edge(v, value));
            }
        }

        visited = new boolean[n + 1];
        distance = new int[n + 1];
        BFS(1);

        int maxIndex = 1;

        for (int i = 1; i < n + 1; i++) {
            if (distance[maxIndex] < distance[i]) maxIndex = i;
        }

        visited = new boolean[n + 1];
        distance = new int[n + 1];
        BFS(maxIndex);

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
                int v = i.v;
                int value = i.value;

                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                    distance[v] = distance[now] + value;
                }
            }
        }
    }

    static class Edge {
        int v;
        int value;

        public Edge(int v, int value) {
            this.v = v;
            this.value = value;
        }
    }

}