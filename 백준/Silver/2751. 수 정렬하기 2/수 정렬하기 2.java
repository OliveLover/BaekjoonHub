import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Main {
  static int[] tmp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    tmp = new int[n];
    int[] arr = IntStream.range(0, n)
      .map(i -> {
        try {
          return Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException ex) {
          System.err.println("잘못된 숫자 형식 입니다.");
          return 0;
        }
      }).toArray();

    mergeSort(arr, 0, n - 1);

    Arrays.stream(arr).forEachOrdered(i -> {sb.append(i).append("\n");});
    System.out.println(sb);
  }

  public static void mergeSort(int[] arr, int s, int e) {
    if(e - s < 1) return;

    int m = s + (e - s) / 2;
    mergeSort(arr, s, m);
    mergeSort(arr, m + 1, e);

    for(int i = s; i < e + 1; i++) {
      tmp[i] = arr[i];
    }

    int k = s;
    int index1 = s;
    int index2 = m + 1;

    while(index1 <= m && index2 <= e) {
      if(tmp[index1] > tmp[index2]) {
        arr[k] = tmp[index2];
        k++;
        index2++;
      }
      else {
        arr[k] = tmp[index1];
        k++;
        index1++;
      }
    }

    while(index1 <= m) {
      arr[k] = tmp[index1];
      k++;
      index1++;
    }
    while(index2 <= e) {
      arr[k] = tmp[index2];
      k++;
      index2++;
    }
  }
}