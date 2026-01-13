import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numbers = new int[2];
        
        for(int i = 0; i < 2; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        String strNumber = String.valueOf(numbers[1]);
        int[] charNumbers = new int[3];
        for(int i = 0; i < 3; i++) {
            charNumbers[i] = strNumber.charAt(i) - '0';
        }

        int result = 0;
        int multiplier = 1;
        for(int i = 2; i >= 0; i--) {
            int multi = numbers[0] * charNumbers[i];
            sb.append(multi).append("\n");
            result += multi * multiplier;
            multiplier *= 10;
        }

        sb.append(result);

        System.out.println(sb);

        br.close();
    }
}