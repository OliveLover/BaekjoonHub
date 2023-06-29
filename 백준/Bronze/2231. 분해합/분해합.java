import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for(int i = 0; i<1000054; i++) {
            int sum = i;

            int j = i;
            while(j>0) {
                sum += j % 10;
                j = j/10;
            }

            if(n == sum) {
                answer = i;
                break;
            }

        }

        System.out.println(answer);

    }
}