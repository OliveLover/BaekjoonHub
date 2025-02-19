import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long[] numbers = new long[10000001];

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i < Math.sqrt(numbers.length); i++) {
            if (numbers[i] == 0) continue;
            for (int j = i + i; j < numbers.length; j += i) {
                    numbers[j] = 0;
            }
        }

        int count = 0;
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] != 0) {
            long temp = numbers[i];
            while((double) numbers[i] <= (double) m / (double) temp) {
                if ((double) numbers[i] >= (double) n / (double) temp) {
                    count++;
                }

                temp *= numbers[i];
            }
          }
        }

        System.out.println(count);
        br.close();
    }
 }