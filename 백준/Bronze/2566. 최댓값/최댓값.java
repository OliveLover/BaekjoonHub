import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int[][] arr = new int[9][9];
    int maxNum = Integer.MIN_VALUE;
    int max_i = 0;
    int max_j = 0;
    
    for (int i = 0; i < 9; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());

        if (maxNum < arr[i][j]) {
          maxNum = arr[i][j];
          max_i = i + 1;
          max_j = j + 1;
        }
      }
    }

    sb.append(maxNum).append("\n");
    sb.append(max_i).append(" ").append(max_j);
    
    System.out.print(sb);
  }
}