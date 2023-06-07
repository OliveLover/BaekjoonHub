import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        int h;
        int w;
        int n;

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            int floor = n%h;
            int room = n/h +1;

            if(floor == 0) {
                floor = h;
                room = n/h;
            }

            sb.append(floor).append("");

            if(room < 10) sb.append("0").append(room).append("\n");
            else sb.append(room).append("\n");
        }
        System.out.println(sb);
    }
}