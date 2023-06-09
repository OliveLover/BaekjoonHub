import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   //StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    
    String number = br.readLine();
    String[] numberArray;

    int sum = 0;
    
    for(int i=0; i<n; i++) {
      
      sum += number.charAt(i) - '0';
    
    }
    
    System.out.println(sum);
  
  }
}