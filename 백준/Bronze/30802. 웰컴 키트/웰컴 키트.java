import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    
    int[] arr = new int[6];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 6; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    int t = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());

    System.out.println(orderT(arr, t));
    System.out.println(orderP(arr, p));

  }

  static int orderT(int[] arr, int t) {
    int count = 0;
    for (int i = 0; i < 6; i++) {
      if (arr[i] == 0) {
        continue;
      }

      if ( arr[i] % t == 0) {
        count += arr[i] / t;
        continue;
      }
      
      count += (arr[i] / t) + 1;
    }

    return count;
  }

  static String orderP(int[] arr, int p) {
    int count = 0;
    int sum = 0;
    for (int i = 0; i < 6; i++) {
      sum += arr[i];
    }

    return (sum / p) + " " + (sum % p);
  }
}