import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int a = Integer.parseInt(br.readLine());
    String b = br.readLine();
    
    for (int i = 2; i >= 0; i--) {
      int w = b.charAt(i) - '0';
      sb.append(a * w).append("\n");
    }
    sb.append(a * Integer.parseInt(b));

    System.out.println(sb);
  }
}