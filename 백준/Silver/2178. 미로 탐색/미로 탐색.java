import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int[] DX = new int[] {1, 0, -1, 0};
    static int[] DY = new int[] {0, 1, 0, -1};
    static boolean[][] VISITED;
    static int[][] DEPTH;
    static int n, m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        DEPTH = new int[n][m];
        VISITED = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String line = st.nextToken();
            for (int j = 0; j < m; j++) {
                DEPTH[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        BFS(0, 0);

        System.out.println(DEPTH[n - 1][m - 1]);
        br.close();
    }

    static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i, j});
        VISITED[i][j] = true;

        while(!queue.isEmpty()) {
            int[] nowNode = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = nowNode[0] + DX[k];
                int y = nowNode[1] + DY[k];

                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (!VISITED[x][y] && DEPTH[x][y] != 0){
                        VISITED[x][y] = true;
                        DEPTH[x][y] = DEPTH[nowNode[0]][nowNode[1]] + 1;
                        queue.add(new int[] {x, y});
                    }
                }
            }
        }
    }
}