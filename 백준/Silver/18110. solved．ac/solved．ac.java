import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] difficulty = IntStream.range(0, n)
                .map(i -> {
                    try {
                        return Integer.parseInt(br.readLine());
                    } catch (NumberFormatException | IOException ex) {
                        System.err.println("잘못된 숫자 형식 입니다.");
                        return 0;
                    }
                }).toArray();

        Arrays.sort(difficulty);

        int frontEndIdx = (int) Math.round(n * 0.15);
        int backStartIdx = n - frontEndIdx;

        double sum = 0;
        for (int i = frontEndIdx; i < backStartIdx; i++) {
            sum += difficulty[i];
        }

        double avg = Math.round(sum / (backStartIdx - frontEndIdx));
        int result = (int) avg;

        System.out.println(result);
    }
}