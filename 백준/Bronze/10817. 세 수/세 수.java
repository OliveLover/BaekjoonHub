import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {  
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int[] arr = br.readLine()
        .lines()
        .flatMap(line -> Arrays.stream(line.split(" ")))
                 .limit(3)
                 .mapToInt(Integer::parseInt)
                 .toArray();

      bubbleSort(arr);
      System.out.println(arr[1]);
    }
  public static void bubbleSort(int[] arr) {
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 2 - i; j++) {
        if(arr[j] > arr[j+1]) swap(arr, j, j + 1);
      }
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}