import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] checkRemainder = new int[42];
        int remainder;
        int count = 0;

        for(int i=0; i<10; i++) {
            remainder = Integer.parseInt(br.readLine())%42;
            checkRemainder[remainder] ++;
        }

        for(int i=0; i<42; i++) {
            if(checkRemainder[i] != 0) count++;
        }

        System.out.println(count);
    }
}