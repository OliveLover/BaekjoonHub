import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int val = n+5;
        if(n == 4 || n == 7) System.out.println(-1);


        else if(val%5 == 1) System.out.println(val/5);
        else if(val%5 == 2) System.out.println(val/5 +1);
        else if(val%5 == 3) System.out.println(val/5);
        else if(val%5 == 4) System.out.println(val/5 +1 );
        else if(n%5 == 0) System.out.println(n/5);
        
    }
}
