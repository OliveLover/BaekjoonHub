import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            if(n <= 6*((i+1)*(i)/2) + 1) {
                System.out.println(i + 1);
                break;
            }
        }
        
    }
}