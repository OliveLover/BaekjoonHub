import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());
        int timer = Integer.parseInt(br.readLine());

        br.close();

        int addHours = timer / 60;
        int addMinutes = timer % 60;

        hours += addHours;
        minutes += addMinutes;
        
        if (minutes >= 60) {
            hours += 1;
            minutes %= 60;
        }

        if (hours >= 24) {
            hours %= 24;
        }

        sb.append(hours).append(" ").append(minutes);
        System.out.println(sb);
    }
}