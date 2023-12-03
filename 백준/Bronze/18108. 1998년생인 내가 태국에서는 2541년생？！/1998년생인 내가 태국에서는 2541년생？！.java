import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int y = Integer.parseInt(br.readLine());
    int result = y - 543;
    System.out.println(result);
  }
}