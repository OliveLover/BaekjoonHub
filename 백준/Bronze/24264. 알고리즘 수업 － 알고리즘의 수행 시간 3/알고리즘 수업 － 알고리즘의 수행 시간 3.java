import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            MenOfPassion();
        }

        System.out.println((long) Math.pow(count, 2));
        System.out.println(2);

    }

    private static void MenOfPassion() {
        count++;
    }
}