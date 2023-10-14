import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] dx = new int[3];
        int[] dy = new int[3];

        int countMaxX = 0;
        int countMaxY = 0;


        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (minX > x) minX = x;
            if (maxX < x) maxX = x;
            if (minY > y) minY = y;
            if (maxY < y) maxY = y;

            dx[i] = x;
            dy[i] = y;

        }

        for (int i = 0; i < 3; i++) {
            if (maxX == dx[i]) countMaxX++;
            if (maxY == dy[i]) countMaxY++;
        }

        if (countMaxX == 1) {
            sb.append(maxX).append(" ");
        } else {
            sb.append(minX).append(" ");
        }

        if (countMaxY == 1) {
            sb.append(maxY);
        } else {
            sb.append(minY);
        }

        System.out.println(sb);
    }
}