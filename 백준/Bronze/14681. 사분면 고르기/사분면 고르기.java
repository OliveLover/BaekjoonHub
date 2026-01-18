import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quardrant = 0;
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0) {
            quardrant = 1;
        } else if (x < 0 && y > 0) {
            quardrant = 2;
        } else if (x < 0 && y < 0) {
            quardrant = 3;
        } else {
            quardrant = 4;
        }

        System.out.println(quardrant);
        
        br.close();
    }
}