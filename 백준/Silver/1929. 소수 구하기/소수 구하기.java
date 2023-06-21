import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        if(n <= 1) return;

        ArrayList<Boolean> primeList = new ArrayList<>(n+1);

        primeList.add(false);
        primeList.add(false);

        for(int i=2; i<=n; i++) {
            primeList.add(i, true);
        }

        for(int i=2; i*i<=n; i++) {
            if(primeList.get(i)) {
                for(int j=i*i; j<=n; j+=i) primeList.set(j, false);
            }
        }

        for(int i=m; i<=n; i++) {
            if(primeList.get(i)) sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}