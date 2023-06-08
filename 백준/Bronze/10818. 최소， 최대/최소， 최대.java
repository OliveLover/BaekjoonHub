import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int [] numList = new int[n];
        int max = -1000000;
        int min = 1000000;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
            if(max < numList[i]) max = numList[i];
            if(min > numList[i]) min = numList[i];
        }
        sb.append(min).append(" ").append(max);

        System.out.println(sb);
    }
}