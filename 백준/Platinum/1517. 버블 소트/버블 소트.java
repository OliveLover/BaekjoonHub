import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Main {
  static long[] tmp;
  static long result = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    tmp = new long[(int)n];
    long[] arr = Arrays.stream(br.readLine().split(" "))
      .limit(n)
      .mapToLong(Long::parseLong)
      .toArray();

    mergeSort(arr, 0, n - 1);

    System.out.println(result);
  }

  public static void mergeSort(long[] arr, int s, int e) {
    if(e - s < 1) return ;

    int m = s + (e - s) / 2;
    mergeSort(arr, s, m);
    mergeSort(arr, m + 1, e);

    if(e + 1 - s >= 0) System.arraycopy(arr, s, tmp, s, (int)(e + 1 - s));

    long k = s;
    long index1 = s;
    long index2 = m + 1;

    while (index1 <= m && index2 <= e) {
      if(tmp[(int)index1] > tmp[(int)index2]) {
        arr[(int)k] = tmp[(int)index2];
        result = result + index2 - k;
        k++;
        index2++;
      } else {
        arr[(int)k] = tmp[(int)index1];
        k++;
        index1++;
      }
    }

    while(index1 <= m) {
      arr[(int)k] = tmp[(int)index1];
      k++;
      index1++;
    }

    while(index2 <= e) {
      arr[(int)k] = tmp[(int)index2];
      k++;
      index2++;
    }
  }
}