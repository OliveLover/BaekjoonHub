import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());

    long[] count = new long[10_001];

    for(int i = 0; i < n; i++) {
      count[Integer.parseInt(br.readLine())]++;
    }

    for(int i = 0; i < 10001; i++) {
      if(count[i] != 0) {
        for(int j = 0; j < count[i]; j++) {
          sb.append(i).append("\n");
        }
      }
    }
    System.out.println(sb);
  }
}