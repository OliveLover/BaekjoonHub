import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] DX = {1, 0, -1, 0};
    static int[] DY = {0, 1, 0, -1};
    static int[][] A;
    static boolean[][] VISITED;
    static int n;
    static int sectionCount = 0;
    static int houseCount = 0;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        A = new int[n][n];
        VISITED = new boolean[n][n];
        ArrayList<Integer> records = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String line = st.nextToken();
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!VISITED[i][j] && A[i][j] != 0) {
                    houseCount = 0;
                    BFS(i, j);
                    records.add(houseCount);
                }
            }
        }

        Collections.sort(records);

        sb.append(sectionCount).append("\n");
        for (int i : records) {
            sb.append(i).append("\n");
        }

        System.out.print(sb);
        br.close();
    }

    static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        VISITED[i][j] = true;
        sectionCount++;
        houseCount++;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = now[0] + DX[k];
                int y = now[1] + DY[k];

                if (x >= 0 && y >= 0 && x < n && y < n) {
                    if (!VISITED[x][y] && A[x][y] != 0) {
                        VISITED[x][y] = true;
                        houseCount++;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}