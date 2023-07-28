import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int[] arr = Arrays.stream(br.readLine().split(" "))
      .limit(3)
      .mapToInt(Integer::parseInt)
      .toArray();

    quickSort(arr, 0, 2);
    
    Arrays.stream(arr).forEach(i -> sb.append(i).append(" "));
    System.out.println(sb);
  }

  public static void quickSort(int[] arr, int s, int e) {
    if(s < e) {
      int pivot = partition(arr, s, e);

      quickSort(arr, s, pivot - 1);
      quickSort(arr, pivot + 1, e);
    }
  }

  public static int partition(int[] arr, int s, int e) {
    int arrLen = arr.length;
    if(s + 1 == e) {
      if(arr[s] > arr[e]) {
        swap(arr, s, e);
      }
      return e;
    }

    int m = s + (e - s) / 2;
    swap(arr, s, m);

    int pivot = arr[s];

    int i = s + 1;
    int j = e;

    while(i <= j) {
      while(arr[j] > pivot && j > 0) {
        j--;
      }
      while(arr[i] < pivot && i < arrLen - 1) {
        i++;
      }
      if(i < j) {
        swap(arr, i, j);
        i++;
        j--;
      }
      else break;
    }

    arr[s] = arr[j];
    arr[j] = pivot;

    return j;
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}