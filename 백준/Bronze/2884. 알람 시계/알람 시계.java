import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        minute -= 45;

        if (0 > minute) {
            hour -= 1;
            minute += 60;
        }

        if (0 > hour) {
            hour += 24;
        }

        sb.append(hour).append(" ").append(minute);

        System.out.println(sb);

        br.close();
    }
}