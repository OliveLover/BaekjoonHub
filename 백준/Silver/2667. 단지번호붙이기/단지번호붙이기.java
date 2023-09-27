import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] residential;
    static boolean[][] visited;
    static int n;
    static int count = 0;
    static int house = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        residential = new int[n][n];
        visited = new boolean[n][n];
        List<Integer> record = new ArrayList<>(n * n / 2);

        for (int i = 0; i < n; i++) {
            String numStr = br.readLine();
            for (int j = 0; j < n; j++) {
                residential[i][j] = numStr.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && residential[i][j] != 0) {
                    house = 0;
                    BFS(i, j);
                    record.add(house);
                }
            }
        }
        Collections.sort(record);

        sb.append(count).append("\n");
        for (int i : record) {
            sb.append(i).append("\n");
        }

        System.out.print(sb);
    }

    private static void BFS(int i, int j) {
        count++;
        house++;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && n > x && n > y) {
                    if(residential[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        house++;
                        queue.offer(new int[] {x, y});
                    }
                }
            }
        }
    }
}