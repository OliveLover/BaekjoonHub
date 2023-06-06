import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String star = "*";
    int num = Integer.parseInt(br.readLine());
    for(int i=0; i<num; i++) {
      for(int j=0; j<=i; j++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}