import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());
        minutes -= 45;

        if(minutes < 0) {
            minutes += 60;
            hours -= 1;
        }

        if(hours < 0) {
            hours += 24;
        }
        
        sb.append(hours).append(" ").append(minutes);

        System.out.print(sb);
    }
}