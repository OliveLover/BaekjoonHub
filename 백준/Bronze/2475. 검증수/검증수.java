import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numList = new int[5];
        int result = 0;
        for(int i=0; i<5; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
            result += numList[i]*numList[i];
        }
        System.out.println(result%10);
    }
}