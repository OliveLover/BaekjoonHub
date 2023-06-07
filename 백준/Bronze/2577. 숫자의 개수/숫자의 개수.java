import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int[] checkNumList = new int[10];

        String num = String.valueOf(a*b*c);
        int numLength = num.length();
        for(int i=0; i<numLength; i++) {
            char n = num.charAt(i);
            checkNumList[n-48]++;
        }
        for(int check : checkNumList) {
            sb.append(check).append("\n");
        }
        System.out.println(sb);
    }
}